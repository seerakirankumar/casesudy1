package com.example.casestudy1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // VERY IMPORTANT
        setContentView(R.layout.activity_main)

        // Link XML views
        val textHello = findViewById<TextView>(R.id.textHello)
        val btnChange = findViewById<Button>(R.id.btnChange)

        // Button click
        btnChange.setOnClickListener {
            textHello.text = "Text Changed Successfully!"
        }
    }
}
