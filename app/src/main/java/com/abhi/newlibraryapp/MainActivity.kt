package com.abhi.newlibraryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.abhi.mylibrary.Multiplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tv)

        textView.setOnClickListener {
            val value = Multiplication.multiply(100) // x*2
            Log.e("VALUE", "" + value);
        }
    }
}