package com.example.chshyapplication

import android.content.Intent
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chshyapplication.databinding.ActivityMainBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.ValueFormatter
import java.io.DataInputStream
import java.io.DataOutputStream
import java.net.*
import java.text.SimpleDateFormat
import java.util.*



class MainActivity : AppCompatActivity() {

    companion object {
        var socket = Socket()
        var server = ServerSocket()
        lateinit var writeSocket: DataOutputStream
        lateinit var readSocket: DataInputStream
        lateinit var cManager: ConnectivityManager

        var ip = ""
        var port = 9179
        var mHandler = Handler()
        var closed = false
    }

    override fun onResume() {
        super.onResume()
        initBarChart(viewBinding.chart)
        getchart(viewBinding.chart)
        getcount()
    }

    private fun getcount() {
        viewBinding.ta11.text = "성도 [접수:${App.prefs.a11}명, 목표:24명] / 새영혼 [접수:${App.prefs.a11n}명]"
        viewBinding.ta12.text = "성도 [접수:${App.prefs.a12}명, 목표:16명] / 새영혼 [접수:${App.prefs.a12n}명]"
        viewBinding.ta13.text = "성도 [접수:${App.prefs.a13}명, 목표:17명] / 새영혼 [접수:${App.prefs.a13n}명]"
        viewBinding.ta14.text = "성도 [접수:${App.prefs.a14}명, 목표:28명] / 새영혼 [접수:${App.prefs.a14n}명]"
        viewBinding.ta21.text = "성도 [접수:${App.prefs.a21}명, 목표:19명] / 새영혼 [접수:${App.prefs.a21n}명]"
        viewBinding.ta22.text = "성도 [접수:${App.prefs.a22}명, 목표:27명] / 새영혼 [접수:${App.prefs.a22n}명]"
        viewBinding.ta23.text = "성도 [접수:${App.prefs.a23}명, 목표:17명] / 새영혼 [접수:${App.prefs.a23n}명]"
        viewBinding.ta24.text = "성도 [접수:${App.prefs.a24}명, 목표:22명] / 새영혼 [접수:${App.prefs.a24n}명]"
    }


    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        server.close()
        socket.close()

        viewBinding.textView55.setOnClickListener {
            startActivity(Intent(this,OldSettingActivity::class.java))
        }
        viewBinding.textView54.setOnClickListener {
            startActivity(Intent(this,NewSettingActivity::class.java))
        }

            if(server.isClosed) {
                Log.d("asdasd", "onCreate: isClosed")
                SetServer().start()
            }else{
                val tstr = port.toString() + "번 포트가 열려있습니다."
                Toast.makeText(this@MainActivity, tstr, Toast.LENGTH_SHORT).show()
                ShowInfo().start()
            }

        Handler(Looper.getMainLooper()).postDelayed({
            ShowInfo().start()
        },3000)



        viewBinding.textView21.setOnClickListener {
            App.prefs.percent += 10f
            initBarChart(viewBinding.chart)
            getchart(viewBinding.chart)
        }
        viewBinding.textView21.setOnLongClickListener {
            App.prefs.percent = 110f
            initBarChart(viewBinding.chart)
            getchart(viewBinding.chart)
            return@setOnLongClickListener true
        }


    val dateFormat = SimpleDateFormat("yyyyMMdd")

    val startDate = dateFormat.parse("20200425").time
    val endDate = dateFormat.parse("20230721").time
        val endDate2 = dateFormat.parse("20230821").time
    val today = Calendar.getInstance().apply {
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }.time.time

        if ((endDate - today) / (24 * 60 * 60 * 1000) < 0){
            viewBinding.dDay.text = "2차 수양회 D+${0-(endDate - today) / (24 * 60 * 60 * 1000)}"
        }else{
            viewBinding.dDay.text = "2차 수양회 D-${(endDate - today) / (24 * 60 * 60 * 1000)}"
        }
        if ((endDate2 - today) / (24 * 60 * 60 * 1000) < 0){
            viewBinding.dDay2.text = "새영혼 접수 D+${0-(endDate2 - today) / (24 * 60 * 60 * 1000)}"
        }else if((endDate2 - today) / (24 * 60 * 60 * 1000) == 0L){
            viewBinding.dDay2.text = "새영혼 접수 D-day!!"
        }else{
            viewBinding.dDay2.text = "새영혼 접수 D-${(endDate2 - today) / (24 * 60 * 60 * 1000)}"
        }



        //handler
        mHandler = object : Handler(Looper.getMainLooper()){  //Thread들로부터 Handler를 통해 메시지를 수신
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                Log.d("asdasd", "handleMessage: ${msg.obj}")
                when(msg.what){
                    1->Toast.makeText(this@MainActivity, "IP 주소가 잘못되었거나 서버의 포트가 개방되지 않았습니다.", Toast.LENGTH_SHORT).show()
                    2->Toast.makeText(this@MainActivity, "서버 포트 "+port +"가 준비되었습니다.", Toast.LENGTH_SHORT).show()
                    3-> {
                        when (msg.obj) {
                            "p11" -> {
                                App.prefs.a11 = App.prefs.a11 + 1
                            }
                            "m11" -> {
                                App.prefs.a11 = App.prefs.a11 - 1
                            }
                            "p12" -> {
                                App.prefs.a12 = App.prefs.a12 + 1
                            }
                            "m12" -> {
                                App.prefs.a12 = App.prefs.a12 - 1
                            }
                            "p13" -> {
                                App.prefs.a13 = App.prefs.a13 + 1
                            }
                            "m13" -> {
                                App.prefs.a13 = App.prefs.a13 - 1
                            }
                            "p14" -> {
                                App.prefs.a14 = App.prefs.a14 + 1
                            }
                            "m14" -> {
                                App.prefs.a14 = App.prefs.a14 - 1
                            }
                            "p21" -> {
                                App.prefs.a21 = App.prefs.a21 + 1
                            }
                            "m21" -> {
                                App.prefs.a21 = App.prefs.a21 - 1
                            }
                            "p22" -> {
                                App.prefs.a22 = App.prefs.a22 + 1
                            }
                            "m22" -> {
                                App.prefs.a22 = App.prefs.a22 - 1
                            }
                            "p23" -> {
                                App.prefs.a23 = App.prefs.a23 + 1
                            }
                            "m23" -> {
                                App.prefs.a23 = App.prefs.a23 - 1
                            }
                            "p24" -> {
                                App.prefs.a24 = App.prefs.a24 + 1
                            }
                            "m24"-> {
                                App.prefs.a24 = App.prefs.a24 - 1
                            }
                            "p11n" -> {
                                App.prefs.a11n = App.prefs.a11n + 1
                            }
                            "m11n" -> {
                                App.prefs.a11n = App.prefs.a11n - 1
                            }
                            "p12n" -> {
                                App.prefs.a12n = App.prefs.a12n + 1
                            }
                            "m12n" -> {
                                App.prefs.a12n = App.prefs.a12n - 1
                            }
                            "p13n" -> {
                                App.prefs.a13n = App.prefs.a13n + 1
                            }
                            "m13n" -> {
                                App.prefs.a13n = App.prefs.a13n - 1
                            }
                            "p14n" -> {
                                App.prefs.a14n = App.prefs.a14n + 1
                            }
                            "m14n" -> {
                                App.prefs.a14n = App.prefs.a14n - 1
                            }
                            "p21n" -> {
                                App.prefs.a21n = App.prefs.a21n + 1
                            }
                            "m21n" -> {
                                App.prefs.a21n = App.prefs.a21n - 1
                            }
                            "p22n" -> {
                                App.prefs.a22n = App.prefs.a22n + 1
                            }
                            "m22n" -> {
                                App.prefs.a22n = App.prefs.a22n - 1
                            }
                            "p23n" -> {
                                App.prefs.a23n = App.prefs.a23n + 1
                            }
                            "m23n" -> {
                                App.prefs.a23n = App.prefs.a23n - 1
                            }
                            "p24n" -> {
                                App.prefs.a24n = App.prefs.a24n + 1
                            }
                            "m24n"-> {
                                App.prefs.a24n = App.prefs.a24n - 1
                            }
                            "dday" -> {
                                viewBinding.dDay.text =
                                    "D-${(endDate - today) / (24 * 60 * 60 * 1000)}"
                            }
                        }
                        getchart(viewBinding.chart)
                        getcount()
                    }
                    4->Toast.makeText(this@MainActivity, "연결이 종료되었습니다.", Toast.LENGTH_SHORT).show()
                    5->Toast.makeText(this@MainActivity, "이미 사용중인 포트입니다.", Toast.LENGTH_SHORT).show()
                    6->Toast.makeText(this@MainActivity, "서버 준비에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                    7->Toast.makeText(this@MainActivity, "서버가 종료되었습니다.", Toast.LENGTH_SHORT).show()
                    8->Toast.makeText(this@MainActivity, "서버가 정상적으로 닫히는데 실패하였습니다.", Toast.LENGTH_SHORT).show()
                    9-> viewBinding.ipport.text = "${msg.obj}"
                    11->Toast.makeText(this@MainActivity, "서버에 접속하였습니다.", Toast.LENGTH_SHORT).show()
                    12->Toast.makeText(this@MainActivity, "메시지 전송에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                    13->Toast.makeText(this@MainActivity, "클라이언트와 연결되었습니다.",Toast.LENGTH_SHORT).show()
                    14->Toast.makeText(this@MainActivity,"서버에서 응답이 없습니다.", Toast.LENGTH_SHORT).show()
                    15->Toast.makeText(this@MainActivity, "서버와의 연결을 종료합니다.", Toast.LENGTH_SHORT).show()
                    16->Toast.makeText(this@MainActivity, "클라이언트와의 연결을 종료합니다.", Toast.LENGTH_SHORT).show()
                    17->Toast.makeText(this@MainActivity, "포트가 이미 닫혀있습니다.", Toast.LENGTH_SHORT).show()
                    18->Toast.makeText(this@MainActivity, "서버와의 연결이 끊어졌습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    class SetServer:Thread(){

        override fun run(){
            try{
                server = ServerSocket(port)    //포트 개방
                mHandler.obtainMessage(2, "").apply {
                    sendToTarget()
                }

                while(true) {
                    socket = server.accept()
                    writeSocket = DataOutputStream(socket.getOutputStream())
                    readSocket = DataInputStream(socket.getInputStream())

                    writeSocket.write(1)    //클라이언트에게 서버의 소켓 생성을 알림
                    mHandler.obtainMessage(13).apply {
                        sendToTarget()
                    }
                    ShowInfo().start()
                    while (true) {
                        val ac = readSocket.read()
                        if(ac==10){    //클라이언트로부터 소켓 종료 명령 수신
                            mHandler.obtainMessage(16).apply {
                                sendToTarget()
                            }
                            break
                        }else if(ac == 2){    //클라이언트로부터 메시지 전송 명령 수신
                            val bac = readSocket.readUTF()
                            val input = bac.toString()
                            val recvInput = input.trim()

                            val msg = mHandler.obtainMessage()
                            msg.what = 3
                            msg.obj = recvInput
                            mHandler.sendMessage(msg)    //핸들러에게 클라이언트로 전달받은 메시지 전송
                        }
                    }
                }

            }catch(e: BindException) {    //이미 개방된 포트를 개방하려 시도하였을때
                mHandler.obtainMessage(5).apply {
                    sendToTarget()
                }
            }catch(e: SocketException){    //소켓이 닫혔을 때
                mHandler.obtainMessage(7).apply {
                    sendToTarget()
                }
            }
            catch(e:Exception){
                if(!closed) {
                    mHandler.obtainMessage(6).apply {
                        sendToTarget()
                    }
                }else{
                    closed = false
                }
            }
        }
    }

    class ShowInfo:Thread(){

        override fun run(){
            lateinit var ip:String
            var breakLoop = false
            val en = NetworkInterface.getNetworkInterfaces()
            while(en.hasMoreElements()){
                val intf = en.nextElement()
                val enumIpAddr = intf.inetAddresses
                while(enumIpAddr.hasMoreElements()){
                    val inetAddress = enumIpAddr.nextElement()
                    if(!inetAddress.isLoopbackAddress && inetAddress is Inet4Address){
                        ip = inetAddress.hostAddress.toString()
                        breakLoop = true
                        break
                    }
                }
                if(breakLoop){
                    break
                }
            }

            val msg = mHandler.obtainMessage()
            msg.what = 9
            msg.obj = ip
            mHandler.sendMessage(msg)
        }
    }

    private fun getchart(barChart: BarChart) {
        // Zoom In / Out 가능 여부 설정
        barChart.setScaleEnabled(false)

        val valueList = ArrayList<BarEntry>()
        val valueList2 = ArrayList<BarEntry>()
        val title = ""
        
        val a11 = (App.prefs.a11).toFloat()/24.toFloat()*100
        val a11n = (App.prefs.a11n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(23f, a11))
        valueList2.add(BarEntry(22f, a11n))

        val a12 = (App.prefs.a12).toFloat()/16.toFloat()*100
        val a12n = (App.prefs.a12n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(20f, a12))
        valueList2.add(BarEntry(19f, a12n))

        val a13 = (App.prefs.a13).toFloat()/17.toFloat()*100
        val a13n = (App.prefs.a13n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(17f, a13))
        valueList2.add(BarEntry(16f, a13n))

        val a14 = (App.prefs.a14).toFloat()/28.toFloat()*100
        val a14n = (App.prefs.a14n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(14f, a14))
        valueList2.add(BarEntry(13f, a14n))

        val a21 = (App.prefs.a21).toFloat()/19.toFloat()*100
        val a21n = (App.prefs.a21n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(11f, a21))
        valueList2.add(BarEntry(10f, a21n))

        val a22 = (App.prefs.a22).toFloat()/27.toFloat()*100
        val a22n = (App.prefs.a22n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(8f, a22))
        valueList2.add(BarEntry(7f, a22n))

        val a23 = (App.prefs.a23).toFloat()/17.toFloat()*100
        val a23n = (App.prefs.a23n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(5f, a23))
        valueList2.add(BarEntry(4f, a23n))

        val a24 = (App.prefs.a24).toFloat()/22.toFloat()*100
        val a24n = (App.prefs.a24n).toFloat()/6.toFloat()*100
        valueList.add(BarEntry(2f, a24))
        valueList2.add(BarEntry(1f, a24n))

        var ndata = App.prefs.a11n+ App.prefs.a12n+ App.prefs.a13n+ App.prefs.a14n+ App.prefs.a21n+ App.prefs.a22n+ App.prefs.a23n+ App.prefs.a24n
        viewBinding.dDay3.text = "새영혼 달성률:${(ndata.toFloat()/48.toFloat()*100).toInt()}%"
        var ndata2 = App.prefs.a11+ App.prefs.a12+ App.prefs.a13+ App.prefs.a14+ App.prefs.a21+ App.prefs.a22+ App.prefs.a23+ App.prefs.a24
        viewBinding.dDay4.text = "기존성도 달성률:${(ndata2.toFloat()/170.toFloat()*100).toInt()}%"

        val barDataSet = BarDataSet(valueList, title)
        // 바 색상 설정 (ColorTemplate.LIBERTY_COLORS)
        barDataSet.setColors(
            Color.rgb(106, 117, 214)
        )
        barDataSet.valueFormatter = object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                return value.toInt().toString() + "%"
            }
        }
        barDataSet.valueTextSize = 24f
        val barDataSet2 = BarDataSet(valueList2, title)
        // 바 색상 설정 (ColorTemplate.LIBERTY_COLORS)
        barDataSet2.setColors(
            Color.rgb(255, 82, 82)
        )

        barDataSet2.valueFormatter = object : ValueFormatter() {
            override fun getFormattedValue(value: Float): String {
                return value.toInt().toString() + "%"
            }
        }
        barDataSet2.valueTextSize = 24f

        val chartData = BarData()
        chartData.addDataSet(barDataSet)
        chartData.addDataSet(barDataSet2)

        barChart.data = chartData
        barChart.invalidate()
    }

    private fun initBarChart(barChart: BarChart) {
        // 차트 회색 배경 설정 (default = false)
        barChart.setDrawGridBackground(false)
        // 막대 그림자 설정 (default = false)
        barChart.setDrawBarShadow(false)
        // 차트 테두리 설정 (default = false)
        barChart.setDrawBorders(false)

        barChart.legend.isEnabled = false

        barChart.xAxis.setDrawLabels(false)

        barChart.axisRight.setDrawGridLines(false)

        barChart.axisRight.setDrawLabels(false)

        barChart.axisLeft.setDrawGridLines(false)



        val description = Description()
        // 오른쪽 하단 모서리 설명 레이블 텍스트 표시 (default = false)
        description.isEnabled = false
        barChart.description = description

        // X, Y 바의 애니메이션 효과
        barChart.animateY(1000)
        barChart.animateX(1000)

        // 바텀 좌표 값
        val xAxis: XAxis = barChart.xAxis

        // x축 위치 설정
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        // 그리드 선 수평 거리 설정
        xAxis.granularity = 1f
        // x축 텍스트 컬러 설정
        xAxis.textColor = Color.RED
        // x축 선 설정 (default = true)
        xAxis.setDrawAxisLine(false)
        // 격자선 설정 (default = true)
        xAxis.setDrawGridLines(false)

        val leftAxis: YAxis = barChart.axisLeft


        // 좌측 선 설정 (default = true)
        leftAxis.setDrawAxisLine(false)
        // 좌측 텍스트 컬러 설정
        leftAxis.textColor = Color.BLACK

        leftAxis.textSize = 16f

        leftAxis.setAxisMaxValue(App.prefs.percent)

        leftAxis.setAxisMinValue(0f)

        leftAxis.setDrawLabels(true)


        val rightAxis: YAxis = barChart.axisRight
        // 우측 선 설정 (default = true)
        rightAxis.setDrawAxisLine(false)
        // 우측 텍스트 컬러 설정
        rightAxis.textColor = Color.BLACK

        // 바차트의 타이틀
        val legend: Legend = barChart.legend
        // 범례 모양 설정 (default = 정사각형)
        legend.form = Legend.LegendForm.LINE
        // 타이틀 텍스트 사이즈 설정
        legend.textSize = 0f
        // 타이틀 텍스트 컬러 설정
        legend.textColor = Color.BLACK
        // 범례 위치 설정
        legend.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        // 범례 방향 설정
        legend.orientation = Legend.LegendOrientation.HORIZONTAL
        // 차트 내부 범례 위치하게 함 (default = false)
        legend.setDrawInside(false)
    }
}