package com.example.doubletappandroidtask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_layout)

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
}
