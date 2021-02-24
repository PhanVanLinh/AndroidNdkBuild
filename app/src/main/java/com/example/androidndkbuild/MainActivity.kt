package com.example.androidndkbuild

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_result)
        textView.text = stringFromJNI()
    }

    external fun stringFromJNI(): String?

    companion object {
        init {
            System.loadLibrary("hello-jni")
        }
    }
}