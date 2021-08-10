package com.geekbrains.mvvmandkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_main)

            val textView: TextView = findViewById(R.id.textView)

            val button: Button = findViewById(R.id.Button)
            button.setOnClickListener {
                textView.text = "Hello!"
            }
        }
    }
}
