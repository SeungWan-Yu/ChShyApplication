package com.example.chshyapplication

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences(context: Context)  {
    val PREFS_FILENAME = "prefs"
    val PREF_KEY_MY_ID = "myEditText"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    var a11: Int
        get() = prefs.getInt("a11", 0)
        set(value) = prefs.edit().putInt("a11", value).apply()
    var a11n: Int
        get() = prefs.getInt("a11n", 0)
        set(value) = prefs.edit().putInt("a11n", value).apply()
    var a12: Int
        get() = prefs.getInt("a12", 0)
        set(value) = prefs.edit().putInt("a12", value).apply()
    var a12n: Int
        get() = prefs.getInt("a12n", 0)
        set(value) = prefs.edit().putInt("a12n", value).apply()
    var a13: Int
        get() = prefs.getInt("a13", 0)
        set(value) = prefs.edit().putInt("a13", value).apply()
    var a13n: Int
        get() = prefs.getInt("a13n", 0)
        set(value) = prefs.edit().putInt("a13n", value).apply()
    var a14: Int
        get() = prefs.getInt("a14", 0)
        set(value) = prefs.edit().putInt("a14", value).apply()
    var a14n: Int
        get() = prefs.getInt("a14n", 0)
        set(value) = prefs.edit().putInt("a14n", value).apply()
    var a21: Int
        get() = prefs.getInt("a21", 0)
        set(value) = prefs.edit().putInt("a21", value).apply()
    var a21n: Int
        get() = prefs.getInt("a21n", 0)
        set(value) = prefs.edit().putInt("a21n", value).apply()
    var a22: Int
        get() = prefs.getInt("a22", 0)
        set(value) = prefs.edit().putInt("a22", value).apply()
    var a22n: Int
        get() = prefs.getInt("a22n", 0)
        set(value) = prefs.edit().putInt("a22n", value).apply()
    var a23: Int
        get() = prefs.getInt("a23", 0)
        set(value) = prefs.edit().putInt("a23", value).apply()
    var a23n: Int
        get() = prefs.getInt("a23n", 0)
        set(value) = prefs.edit().putInt("a23n", value).apply()
    var a24: Int
        get() = prefs.getInt("a24", 0)
        set(value) = prefs.edit().putInt("a24", value).apply()
    var a24n: Int
        get() = prefs.getInt("a24n", 0)
        set(value) = prefs.edit().putInt("a24n", value).apply()

    var percent: Float
        get() = prefs.getFloat("percent", 110f)
        set(value) = prefs.edit().putFloat("percent", value).apply()
}
