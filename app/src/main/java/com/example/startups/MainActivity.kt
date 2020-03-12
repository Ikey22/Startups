package com.example.startups

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message : EditText = findViewById(R.id.writeText)
        val submitText : TextView = findViewById(R.id.btnSubmit)


        submitText.setOnClickListener {

            var messageGotten = message.text.toString()
            val intent = Intent(this, Myactivity ::class.java)
            intent.putExtra("Message is received: ", messageGotten)
            startActivity(intent)



        }
    }
}
