package com.example.chshyapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.chshyapplication.databinding.ActivityBusSettingBinding
import com.example.chshyapplication.databinding.ActivityNewSettingBinding
import java.util.Calendar

class BusSettingActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityBusSettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityBusSettingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.a11c.text = App.prefs.a11b.toString()
        viewBinding.a12c.text = App.prefs.a12b.toString()
        viewBinding.a13c.text = App.prefs.a13b.toString()
        viewBinding.a21c.text = App.prefs.a21b.toString()
        viewBinding.a22c.text = App.prefs.a22b.toString()
        viewBinding.a23c.text = App.prefs.a23b.toString()
        viewBinding.a31c.text = App.prefs.a31b.toString()
        viewBinding.a32c.text = App.prefs.a32b.toString()
        viewBinding.a33c.text = App.prefs.a33b.toString()


        viewBinding.a11plus1.setOnClickListener {
            App.prefs.a11b = App.prefs.a11b+1
            viewBinding.a11c.text = App.prefs.a11b.toString()
        }
        viewBinding.a11minus1.setOnClickListener {
            App.prefs.a11b = App.prefs.a11b-1
            viewBinding.a11c.text = App.prefs.a11b.toString()
        }
        viewBinding.a11plus10.setOnClickListener {
            App.prefs.a11b = App.prefs.a11b+10
            viewBinding.a11c.text = App.prefs.a11b.toString()
        }
        viewBinding.a11minus10.setOnClickListener {
            App.prefs.a11b = App.prefs.a11b-10
            viewBinding.a11c.text = App.prefs.a11b.toString()
        }

        viewBinding.a12plus1.setOnClickListener {
            App.prefs.a12b = App.prefs.a12b+1
            viewBinding.a12c.text = App.prefs.a12b.toString()
        }
        viewBinding.a12minus1.setOnClickListener {
            App.prefs.a12b = App.prefs.a12b-1
            viewBinding.a12c.text = App.prefs.a12b.toString()
        }
        viewBinding.a12plus10.setOnClickListener {
            App.prefs.a12b = App.prefs.a12b+10
            viewBinding.a12c.text = App.prefs.a12b.toString()
        }
        viewBinding.a12minus10.setOnClickListener {
            App.prefs.a12b = App.prefs.a12b-10
            viewBinding.a12c.text = App.prefs.a12b.toString()
        }

        viewBinding.a13plus1.setOnClickListener {
            App.prefs.a13b = App.prefs.a13b+1
            viewBinding.a13c.text = App.prefs.a13b.toString()
        }
        viewBinding.a13minus1.setOnClickListener {
            App.prefs.a13b = App.prefs.a13b-1
            viewBinding.a13c.text = App.prefs.a13b.toString()
        }
        viewBinding.a13plus10.setOnClickListener {
            App.prefs.a13b = App.prefs.a13b+10
            viewBinding.a13c.text = App.prefs.a13b.toString()
        }
        viewBinding.a13minus10.setOnClickListener {
            App.prefs.a13b = App.prefs.a13b-10
            viewBinding.a13c.text = App.prefs.a13b.toString()
        }

        viewBinding.a21plus1.setOnClickListener {
            App.prefs.a21b = App.prefs.a21b+1
            viewBinding.a21c.text = App.prefs.a21b.toString()
        }
        viewBinding.a21minus1.setOnClickListener {
            App.prefs.a21b = App.prefs.a21b-1
            viewBinding.a21c.text = App.prefs.a21b.toString()
        }
        viewBinding.a21plus10.setOnClickListener {
            App.prefs.a21b = App.prefs.a21b+10
            viewBinding.a21c.text = App.prefs.a21b.toString()
        }
        viewBinding.a21minus10.setOnClickListener {
            App.prefs.a21b = App.prefs.a21b-10
            viewBinding.a21c.text = App.prefs.a21b.toString()
        }

        viewBinding.a22plus1.setOnClickListener {
            App.prefs.a22b = App.prefs.a22b+1
            viewBinding.a22c.text = App.prefs.a22b.toString()
        }
        viewBinding.a22minus1.setOnClickListener {
            App.prefs.a22b = App.prefs.a22b-1
            viewBinding.a22c.text = App.prefs.a22b.toString()
        }
        viewBinding.a22plus10.setOnClickListener {
            App.prefs.a22b = App.prefs.a22b+10
            viewBinding.a22c.text = App.prefs.a22b.toString()
        }
        viewBinding.a22minus10.setOnClickListener {
            App.prefs.a22b = App.prefs.a22b-10
            viewBinding.a22c.text = App.prefs.a22b.toString()
        }

        viewBinding.a23plus1.setOnClickListener {
            App.prefs.a23b = App.prefs.a23b+1
            viewBinding.a23c.text = App.prefs.a23b.toString()
        }
        viewBinding.a23minus1.setOnClickListener {
            App.prefs.a23b = App.prefs.a23b-1
            viewBinding.a23c.text = App.prefs.a23b.toString()
        }
        viewBinding.a23plus10.setOnClickListener {
            App.prefs.a23b = App.prefs.a23b+10
            viewBinding.a23c.text = App.prefs.a23b.toString()
        }
        viewBinding.a23minus10.setOnClickListener {
            App.prefs.a23b = App.prefs.a23b-10
            viewBinding.a23c.text = App.prefs.a23b.toString()
        }

        viewBinding.a31plus1.setOnClickListener {
            App.prefs.a31b = App.prefs.a31b+1
            viewBinding.a31c.text = App.prefs.a31b.toString()
        }
        viewBinding.a31minus1.setOnClickListener {
            App.prefs.a31b = App.prefs.a31b-1
            viewBinding.a31c.text = App.prefs.a31b.toString()
        }
        viewBinding.a31plus10.setOnClickListener {
            App.prefs.a31b = App.prefs.a31b+10
            viewBinding.a31c.text = App.prefs.a31b.toString()
        }
        viewBinding.a31minus10.setOnClickListener {
            App.prefs.a31b = App.prefs.a31b-10
            viewBinding.a31c.text = App.prefs.a31b.toString()
        }

        viewBinding.a32plus1.setOnClickListener {
            App.prefs.a32b = App.prefs.a32b+1
            viewBinding.a32c.text = App.prefs.a32b.toString()
        }
        viewBinding.a32minus1.setOnClickListener {
            App.prefs.a32b = App.prefs.a32b-1
            viewBinding.a32c.text = App.prefs.a32b.toString()
        }
        viewBinding.a32plus10.setOnClickListener {
            App.prefs.a32b = App.prefs.a32b+10
            viewBinding.a32c.text = App.prefs.a32b.toString()
        }
        viewBinding.a32minus10.setOnClickListener {
            App.prefs.a32b = App.prefs.a32b-10
            viewBinding.a32c.text = App.prefs.a32b.toString()
        }

        viewBinding.a33plus1.setOnClickListener {
            App.prefs.a33b = App.prefs.a33b+1
            viewBinding.a33c.text = App.prefs.a33b.toString()
        }
        viewBinding.a33minus1.setOnClickListener {
            App.prefs.a33b = App.prefs.a33b-1
            viewBinding.a33c.text = App.prefs.a33b.toString()
        }
        viewBinding.a33plus10.setOnClickListener {
            App.prefs.a33b = App.prefs.a33b+10
            viewBinding.a33c.text = App.prefs.a33b.toString()
        }
        viewBinding.a33minus10.setOnClickListener {
            App.prefs.a33b = App.prefs.a33b-10
            viewBinding.a33c.text = App.prefs.a33b.toString()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        val cal = Calendar.getInstance()
        App.prefs.date = "${(cal.get(Calendar.MONTH))+1}월 ${cal.get(Calendar.DATE)}일 ${cal.get(
            Calendar.HOUR_OF_DAY)}시 기준"
    }

}