package com.example.doubletappandroidtask

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_layout)

        Log.d("SecondActivity", "activity created")

        val counter = intent.getIntExtra("counter", 0)
        val squaredCounterTextView = findViewById<TextView>(R.id.squaredCounterTextView)
        squaredCounterTextView.text = (counter * counter).toString()
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "activity destroyed")
    }
}