package com.example.doubletappandroidtask

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_layout)

        val counter = intent.getIntExtra("counter", 0)
        val squaredCounterTextView = findViewById<TextView>(R.id.squaredCounterTextView)
        squaredCounterTextView.text = (counter * counter).toString()
    }
}