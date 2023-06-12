package com.example.chshyapplication

import android.app.Application

class App : Application() {
//    가장먼저 실행되어 초기화 시켜줘야 함
//    Manifest application에 android:name=".App" 추가

    companion   object {
        lateinit var prefs : MySharedPreferences
    }

    override fun onCreate() {
        prefs = MySharedPreferences(applicationContext)
        super.onCreate()
    }
}