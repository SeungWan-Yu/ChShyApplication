package com.example.chshyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chshyapplication.databinding.ActivityNewSettingBinding
import com.example.chshyapplication.databinding.ActivityOldSettingBinding
import java.util.Calendar

class NewSettingActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityNewSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityNewSettingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.a11c.text = App.prefs.a11n.toString()
        viewBinding.a12c.text = App.prefs.a12n.toString()
        viewBinding.a13c.text = App.prefs.a13n.toString()
        viewBinding.a21c.text = App.prefs.a21n.toString()
        viewBinding.a22c.text = App.prefs.a22n.toString()
        viewBinding.a23c.text = App.prefs.a23n.toString()
        viewBinding.a31c.text = App.prefs.a31n.toString()
        viewBinding.a32c.text = App.prefs.a32n.toString()
        viewBinding.a33c.text = App.prefs.a33n.toString()


        viewBinding.a11plus1.setOnClickListener {
            App.prefs.a11n = App.prefs.a11n+1
            viewBinding.a11c.text = App.prefs.a11n.toString()
        }
        viewBinding.a11minus1.setOnClickListener {
            App.prefs.a11n = App.prefs.a11n-1
            viewBinding.a11c.text = App.prefs.a11n.toString()
        }
        viewBinding.a11plus10.setOnClickListener {
            App.prefs.a11n = App.prefs.a11n+10
            viewBinding.a11c.text = App.prefs.a11n.toString()
        }
        viewBinding.a11minus10.setOnClickListener {
            App.prefs.a11n = App.prefs.a11n-10
            viewBinding.a11c.text = App.prefs.a11n.toString()
        }

        viewBinding.a12plus1.setOnClickListener {
            App.prefs.a12n = App.prefs.a12n+1
            viewBinding.a12c.text = App.prefs.a12n.toString()
        }
        viewBinding.a12minus1.setOnClickListener {
            App.prefs.a12n = App.prefs.a12n-1
            viewBinding.a12c.text = App.prefs.a12n.toString()
        }
        viewBinding.a12plus10.setOnClickListener {
            App.prefs.a12n = App.prefs.a12n+10
            viewBinding.a12c.text = App.prefs.a12n.toString()
        }
        viewBinding.a12minus10.setOnClickListener {
            App.prefs.a12n = App.prefs.a12n-10
            viewBinding.a12c.text = App.prefs.a12n.toString()
        }

        viewBinding.a13plus1.setOnClickListener {
            App.prefs.a13n = App.prefs.a13n+1
            viewBinding.a13c.text = App.prefs.a13n.toString()
        }
        viewBinding.a13minus1.setOnClickListener {
            App.prefs.a13n = App.prefs.a13n-1
            viewBinding.a13c.text = App.prefs.a13n.toString()
        }
        viewBinding.a13plus10.setOnClickListener {
            App.prefs.a13n = App.prefs.a13n+10
            viewBinding.a13c.text = App.prefs.a13n.toString()
        }
        viewBinding.a13minus10.setOnClickListener {
            App.prefs.a13n = App.prefs.a13n-10
            viewBinding.a13c.text = App.prefs.a13n.toString()
        }

        viewBinding.a21plus1.setOnClickListener {
            App.prefs.a21n = App.prefs.a21n+1
            viewBinding.a21c.text = App.prefs.a21n.toString()
        }
        viewBinding.a21minus1.setOnClickListener {
            App.prefs.a21n = App.prefs.a21n-1
            viewBinding.a21c.text = App.prefs.a21n.toString()
        }
        viewBinding.a21plus10.setOnClickListener {
            App.prefs.a21n = App.prefs.a21n+10
            viewBinding.a21c.text = App.prefs.a21n.toString()
        }
        viewBinding.a21minus10.setOnClickListener {
            App.prefs.a21n = App.prefs.a21n-10
            viewBinding.a21c.text = App.prefs.a21n.toString()
        }

        viewBinding.a22plus1.setOnClickListener {
            App.prefs.a22n = App.prefs.a22n+1
            viewBinding.a22c.text = App.prefs.a22n.toString()
        }
        viewBinding.a22minus1.setOnClickListener {
            App.prefs.a22n = App.prefs.a22n-1
            viewBinding.a22c.text = App.prefs.a22n.toString()
        }
        viewBinding.a22plus10.setOnClickListener {
            App.prefs.a22n = App.prefs.a22n+10
            viewBinding.a22c.text = App.prefs.a22n.toString()
        }
        viewBinding.a22minus10.setOnClickListener {
            App.prefs.a22n = App.prefs.a22n-10
            viewBinding.a22c.text = App.prefs.a22n.toString()
        }

        viewBinding.a23plus1.setOnClickListener {
            App.prefs.a23n = App.prefs.a23n+1
            viewBinding.a23c.text = App.prefs.a23n.toString()
        }
        viewBinding.a23minus1.setOnClickListener {
            App.prefs.a23n = App.prefs.a23n-1
            viewBinding.a23c.text = App.prefs.a23n.toString()
        }
        viewBinding.a23plus10.setOnClickListener {
            App.prefs.a23n = App.prefs.a23n+10
            viewBinding.a23c.text = App.prefs.a23n.toString()
        }
        viewBinding.a23minus10.setOnClickListener {
            App.prefs.a23n = App.prefs.a23n-10
            viewBinding.a23c.text = App.prefs.a23n.toString()
        }

        viewBinding.a31plus1.setOnClickListener {
            App.prefs.a31n = App.prefs.a31n+1
            viewBinding.a31c.text = App.prefs.a31n.toString()
        }
        viewBinding.a31minus1.setOnClickListener {
            App.prefs.a31n = App.prefs.a31n-1
            viewBinding.a31c.text = App.prefs.a31n.toString()
        }
        viewBinding.a31plus10.setOnClickListener {
            App.prefs.a31n = App.prefs.a31n+10
            viewBinding.a31c.text = App.prefs.a31n.toString()
        }
        viewBinding.a31minus10.setOnClickListener {
            App.prefs.a31n = App.prefs.a31n-10
            viewBinding.a31c.text = App.prefs.a31n.toString()
        }

        viewBinding.a32plus1.setOnClickListener {
            App.prefs.a32n = App.prefs.a32n+1
            viewBinding.a32c.text = App.prefs.a32n.toString()
        }
        viewBinding.a32minus1.setOnClickListener {
            App.prefs.a32n = App.prefs.a32n-1
            viewBinding.a32c.text = App.prefs.a32n.toString()
        }
        viewBinding.a32plus10.setOnClickListener {
            App.prefs.a32n = App.prefs.a32n+10
            viewBinding.a32c.text = App.prefs.a32n.toString()
        }
        viewBinding.a32minus10.setOnClickListener {
            App.prefs.a32n = App.prefs.a32n-10
            viewBinding.a32c.text = App.prefs.a32n.toString()
        }

        viewBinding.a33plus1.setOnClickListener {
            App.prefs.a33n = App.prefs.a33n+1
            viewBinding.a33c.text = App.prefs.a33n.toString()
        }
        viewBinding.a33minus1.setOnClickListener {
            App.prefs.a33n = App.prefs.a33n-1
            viewBinding.a33c.text = App.prefs.a33n.toString()
        }
        viewBinding.a33plus10.setOnClickListener {
            App.prefs.a33n = App.prefs.a33n+10
            viewBinding.a33c.text = App.prefs.a33n.toString()
        }
        viewBinding.a33minus10.setOnClickListener {
            App.prefs.a33n = App.prefs.a33n-10
            viewBinding.a33c.text = App.prefs.a33n.toString()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        val cal = Calendar.getInstance()
        App.prefs.date = "${(cal.get(Calendar.MONTH))+1}월 ${cal.get(Calendar.DATE)}일 ${cal.get(
            Calendar.HOUR_OF_DAY)}시 기준"
    }
}