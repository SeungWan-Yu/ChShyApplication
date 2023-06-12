package com.example.chshyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chshyapplication.databinding.ActivityNewSettingBinding
import com.example.chshyapplication.databinding.ActivityOldSettingBinding

class NewSettingActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityNewSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityNewSettingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.a11c.text = App.prefs.a11n.toString()
        viewBinding.a12c.text = App.prefs.a12n.toString()
        viewBinding.a13c.text = App.prefs.a13n.toString()
        viewBinding.a14c.text = App.prefs.a14n.toString()
        viewBinding.a21c.text = App.prefs.a21n.toString()
        viewBinding.a22c.text = App.prefs.a22n.toString()
        viewBinding.a23c.text = App.prefs.a23n.toString()
        viewBinding.a24c.text = App.prefs.a24n.toString()


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

        viewBinding.a14plus1.setOnClickListener {
            App.prefs.a14n = App.prefs.a14n+1
            viewBinding.a14c.text = App.prefs.a14n.toString()
        }
        viewBinding.a14minus1.setOnClickListener {
            App.prefs.a14n = App.prefs.a14n-1
            viewBinding.a14c.text = App.prefs.a14n.toString()
        }
        viewBinding.a14plus10.setOnClickListener {
            App.prefs.a14n = App.prefs.a14n+10
            viewBinding.a14c.text = App.prefs.a14n.toString()
        }
        viewBinding.a14minus10.setOnClickListener {
            App.prefs.a14n = App.prefs.a14n-10
            viewBinding.a14c.text = App.prefs.a14n.toString()
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

        viewBinding.a24plus1.setOnClickListener {
            App.prefs.a24n = App.prefs.a24n+1
            viewBinding.a24c.text = App.prefs.a24n.toString()
        }
        viewBinding.a24minus1.setOnClickListener {
            App.prefs.a24n = App.prefs.a24n-1
            viewBinding.a24c.text = App.prefs.a24n.toString()
        }
        viewBinding.a24plus10.setOnClickListener {
            App.prefs.a24n = App.prefs.a24n+10
            viewBinding.a24c.text = App.prefs.a24n.toString()
        }
        viewBinding.a24minus10.setOnClickListener {
            App.prefs.a24n = App.prefs.a24n-10
            viewBinding.a24c.text = App.prefs.a24n.toString()
        }
    }
}