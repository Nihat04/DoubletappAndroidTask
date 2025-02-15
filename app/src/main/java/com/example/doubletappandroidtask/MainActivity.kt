package com.example.doubletappandroidtask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_layout)

        Log.d("MainActivity", "activity created")

        val textView = findViewById<TextView>(R.id.counterTextView)
        val button = findViewById<Button>(R.id.openSecondActivityButton)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter")
        }
        counter++
        textView.text = counter.toString()

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("counter", counter)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "activity destroyed")
    }
}
