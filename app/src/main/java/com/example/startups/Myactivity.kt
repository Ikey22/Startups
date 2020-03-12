package com.example.startups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Myactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myactivity)

        var intent = intent
        val mess = intent.getStringExtra("Message is received: ")

        val myText = findViewById<TextView>(R.id.myText)

        myText.text = mess
//        val textHello :TextView = findViewById(R.id.myText)
//        textHello.setText("Welcome to new actvity")

    }


}
