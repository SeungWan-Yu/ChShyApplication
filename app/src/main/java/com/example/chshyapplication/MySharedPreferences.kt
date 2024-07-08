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
    var a11b: Int
        get() = prefs.getInt("a11b", 0)
        set(value) = prefs.edit().putInt("a11b", value).apply()
    var a12: Int
        get() = prefs.getInt("a12", 0)
        set(value) = prefs.edit().putInt("a12", value).apply()
    var a12n: Int
        get() = prefs.getInt("a12n", 0)
        set(value) = prefs.edit().putInt("a12n", value).apply()
    var a12b: Int
        get() = prefs.getInt("a12b", 0)
        set(value) = prefs.edit().putInt("a12b", value).apply()
    var a13: Int
        get() = prefs.getInt("a13", 0)
        set(value) = prefs.edit().putInt("a13", value).apply()
    var a13n: Int
        get() = prefs.getInt("a13n", 0)
        set(value) = prefs.edit().putInt("a13n", value).apply()
    var a13b: Int
        get() = prefs.getInt("a13b", 0)
        set(value) = prefs.edit().putInt("a13b", value).apply()
    var a21: Int
        get() = prefs.getInt("a21", 0)
        set(value) = prefs.edit().putInt("a21", value).apply()
    var a21n: Int
        get() = prefs.getInt("a21n", 0)
        set(value) = prefs.edit().putInt("a21n", value).apply()
    var a21b: Int
        get() = prefs.getInt("a21b", 0)
        set(value) = prefs.edit().putInt("a21b", value).apply()
    var a22: Int
        get() = prefs.getInt("a22", 0)
        set(value) = prefs.edit().putInt("a22", value).apply()
    var a22n: Int
        get() = prefs.getInt("a22n", 0)
        set(value) = prefs.edit().putInt("a22n", value).apply()
    var a22b: Int
        get() = prefs.getInt("a22b", 0)
        set(value) = prefs.edit().putInt("a22b", value).apply()
    var a23: Int
        get() = prefs.getInt("a23", 0)
        set(value) = prefs.edit().putInt("a23", value).apply()
    var a23n: Int
        get() = prefs.getInt("a23n", 0)
        set(value) = prefs.edit().putInt("a23n", value).apply()
    var a23b: Int
        get() = prefs.getInt("a23b", 0)
        set(value) = prefs.edit().putInt("a23b", value).apply()
    var a31: Int
        get() = prefs.getInt("a31", 0)
        set(value) = prefs.edit().putInt("a31", value).apply()
    var a31n: Int
        get() = prefs.getInt("a31n", 0)
        set(value) = prefs.edit().putInt("a31n", value).apply()
    var a31b: Int
        get() = prefs.getInt("a31b", 0)
        set(value) = prefs.edit().putInt("a31b", value).apply()
    var a32: Int
        get() = prefs.getInt("a32", 0)
        set(value) = prefs.edit().putInt("a32", value).apply()
    var a32n: Int
        get() = prefs.getInt("a32n", 0)
        set(value) = prefs.edit().putInt("a32n", value).apply()
    var a32b: Int
        get() = prefs.getInt("a32b", 0)
        set(value) = prefs.edit().putInt("a32b", value).apply()
    var a33: Int
        get() = prefs.getInt("a33", 0)
        set(value) = prefs.edit().putInt("a33", value).apply()
    var a33n: Int
        get() = prefs.getInt("a33n", 0)
        set(value) = prefs.edit().putInt("a33n", value).apply()
    var a33b: Int
        get() = prefs.getInt("a33b", 0)
        set(value) = prefs.edit().putInt("a33b", value).apply()

    var percent: Float
        get() = prefs.getFloat("percent", 110f)
        set(value) = prefs.edit().putFloat("percent", value).apply()
    var date: String
        get() = prefs.getString("date", "").toString()
        set(value) = prefs.edit().putString("date", value).apply()
}
