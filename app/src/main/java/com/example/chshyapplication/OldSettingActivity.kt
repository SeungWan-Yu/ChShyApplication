package com.example.chshyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chshyapplication.databinding.ActivityOldSettingBinding

class OldSettingActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityOldSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityOldSettingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.a11c.text = App.prefs.a11.toString()
        viewBinding.a12c.text = App.prefs.a12.toString()
        viewBinding.a13c.text = App.prefs.a13.toString()
        viewBinding.a21c.text = App.prefs.a21.toString()
        viewBinding.a22c.text = App.prefs.a22.toString()
        viewBinding.a23c.text = App.prefs.a23.toString()
        viewBinding.a31c.text = App.prefs.a31.toString()
        viewBinding.a32c.text = App.prefs.a32.toString()
        viewBinding.a33c.text = App.prefs.a33.toString()


        viewBinding.a11plus1.setOnClickListener {
            App.prefs.a11 = App.prefs.a11+1
            viewBinding.a11c.text = App.prefs.a11.toString()
        }
        viewBinding.a11minus1.setOnClickListener {
            App.prefs.a11 = App.prefs.a11-1
            viewBinding.a11c.text = App.prefs.a11.toString()
        }
        viewBinding.a11plus10.setOnClickListener {
            App.prefs.a11 = App.prefs.a11+10
            viewBinding.a11c.text = App.prefs.a11.toString()
        }
        viewBinding.a11minus10.setOnClickListener {
            App.prefs.a11 = App.prefs.a11-10
            viewBinding.a11c.text = App.prefs.a11.toString()
        }

        viewBinding.a12plus1.setOnClickListener {
            App.prefs.a12 = App.prefs.a12+1
            viewBinding.a12c.text = App.prefs.a12.toString()
        }
        viewBinding.a12minus1.setOnClickListener {
            App.prefs.a12 = App.prefs.a12-1
            viewBinding.a12c.text = App.prefs.a12.toString()
        }
        viewBinding.a12plus10.setOnClickListener {
            App.prefs.a12 = App.prefs.a12+10
            viewBinding.a12c.text = App.prefs.a12.toString()
        }
        viewBinding.a12minus10.setOnClickListener {
            App.prefs.a12 = App.prefs.a12-10
            viewBinding.a12c.text = App.prefs.a12.toString()
        }

        viewBinding.a13plus1.setOnClickListener {
            App.prefs.a13 = App.prefs.a13+1
            viewBinding.a13c.text = App.prefs.a13.toString()
        }
        viewBinding.a13minus1.setOnClickListener {
            App.prefs.a13 = App.prefs.a13-1
            viewBinding.a13c.text = App.prefs.a13.toString()
        }
        viewBinding.a13plus10.setOnClickListener {
            App.prefs.a13 = App.prefs.a13+10
            viewBinding.a13c.text = App.prefs.a13.toString()
        }
        viewBinding.a13minus10.setOnClickListener {
            App.prefs.a13 = App.prefs.a13-10
            viewBinding.a13c.text = App.prefs.a13.toString()
        }


        viewBinding.a21plus1.setOnClickListener {
            App.prefs.a21 = App.prefs.a21+1
            viewBinding.a21c.text = App.prefs.a21.toString()
        }
        viewBinding.a21minus1.setOnClickListener {
            App.prefs.a21 = App.prefs.a21-1
            viewBinding.a21c.text = App.prefs.a21.toString()
        }
        viewBinding.a21plus10.setOnClickListener {
            App.prefs.a21 = App.prefs.a21+10
            viewBinding.a21c.text = App.prefs.a21.toString()
        }
        viewBinding.a21minus10.setOnClickListener {
            App.prefs.a21 = App.prefs.a21-10
            viewBinding.a21c.text = App.prefs.a21.toString()
        }

        viewBinding.a22plus1.setOnClickListener {
            App.prefs.a22 = App.prefs.a22+1
            viewBinding.a22c.text = App.prefs.a22.toString()
        }
        viewBinding.a22minus1.setOnClickListener {
            App.prefs.a22 = App.prefs.a22-1
            viewBinding.a22c.text = App.prefs.a22.toString()
        }
        viewBinding.a22plus10.setOnClickListener {
            App.prefs.a22 = App.prefs.a22+10
            viewBinding.a22c.text = App.prefs.a22.toString()
        }
        viewBinding.a22minus10.setOnClickListener {
            App.prefs.a22 = App.prefs.a22-10
            viewBinding.a22c.text = App.prefs.a22.toString()
        }

        viewBinding.a23plus1.setOnClickListener {
            App.prefs.a23 = App.prefs.a23+1
            viewBinding.a23c.text = App.prefs.a23.toString()
        }
        viewBinding.a23minus1.setOnClickListener {
            App.prefs.a23 = App.prefs.a23-1
            viewBinding.a23c.text = App.prefs.a23.toString()
        }
        viewBinding.a23plus10.setOnClickListener {
            App.prefs.a23 = App.prefs.a23+10
            viewBinding.a23c.text = App.prefs.a23.toString()
        }
        viewBinding.a23minus10.setOnClickListener {
            App.prefs.a23 = App.prefs.a23-10
            viewBinding.a23c.text = App.prefs.a23.toString()
        }

        viewBinding.a31plus1.setOnClickListener {
            App.prefs.a31 = App.prefs.a31+1
            viewBinding.a31c.text = App.prefs.a31.toString()
        }
        viewBinding.a31minus1.setOnClickListener {
            App.prefs.a31 = App.prefs.a31-1
            viewBinding.a31c.text = App.prefs.a31.toString()
        }
        viewBinding.a31plus10.setOnClickListener {
            App.prefs.a31 = App.prefs.a31+10
            viewBinding.a31c.text = App.prefs.a31.toString()
        }
        viewBinding.a31minus10.setOnClickListener {
            App.prefs.a31 = App.prefs.a31-10
            viewBinding.a31c.text = App.prefs.a31.toString()
        }

        viewBinding.a32plus1.setOnClickListener {
            App.prefs.a32 = App.prefs.a32+1
            viewBinding.a32c.text = App.prefs.a32.toString()
        }
        viewBinding.a32minus1.setOnClickListener {
            App.prefs.a32 = App.prefs.a32-1
            viewBinding.a32c.text = App.prefs.a32.toString()
        }
        viewBinding.a32plus10.setOnClickListener {
            App.prefs.a32 = App.prefs.a32+10
            viewBinding.a32c.text = App.prefs.a32.toString()
        }
        viewBinding.a32minus10.setOnClickListener {
            App.prefs.a32 = App.prefs.a32-10
            viewBinding.a32c.text = App.prefs.a32.toString()
        }

        viewBinding.a33plus1.setOnClickListener {
            App.prefs.a33 = App.prefs.a33+1
            viewBinding.a33c.text = App.prefs.a33.toString()
        }
        viewBinding.a33minus1.setOnClickListener {
            App.prefs.a33 = App.prefs.a33-1
            viewBinding.a33c.text = App.prefs.a33.toString()
        }
        viewBinding.a33plus10.setOnClickListener {
            App.prefs.a33 = App.prefs.a33+10
            viewBinding.a33c.text = App.prefs.a33.toString()
        }
        viewBinding.a33minus10.setOnClickListener {
            App.prefs.a33 = App.prefs.a33-10
            viewBinding.a33c.text = App.prefs.a33.toString()
        }
    }
}