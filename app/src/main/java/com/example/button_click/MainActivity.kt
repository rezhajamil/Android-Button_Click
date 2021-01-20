package com.example.button_click

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val useret = findViewById<EditText>(R.id.username)
        val txtku = findViewById<TextView>(R.id.teks1)
        val text1=useret.text
        val passwordtv = findViewById<EditText>(R.id.password)
        val button = findViewById<Button>(R.id.btn)
        val button2 = findViewById<Button>(R.id.btn2)

        button?.setOnClickListener(){
            Toast.makeText(this,"Hallo "+text1,Toast.LENGTH_LONG).show()
            txtku.setText(text1).toString()
        }

        button?.setOnClickListener() {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        button2?.setOnClickListener() {
            val intent2= Intent(this,MainActivity3::class.java)
            intent2.putExtra(MainActivity3.EXTRA_TEXT,"Rezha")
            startActivity(intent2)
        }
    }
}