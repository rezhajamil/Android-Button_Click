package com.example.button_click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    companion object{
        const val EXTRA_TEXT="extra_text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val tvReceiver=findViewById<TextView>(R.id.text_data)
        val textReceived= intent.getStringExtra(EXTRA_TEXT)
        val text = "Hello  $textReceived"
        tvReceiver.text = text
    }
}