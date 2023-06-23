package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var conversionn:Button
    private lateinit var calculationn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        conversionn = findViewById(R.id.conversion)
        calculationn = findViewById(R.id.calculation)
        conversionn.setOnClickListener {
            val srcintent = Intent(this, Conversion::class.java)
            startActivity(srcintent)
        }
        calculationn.setOnClickListener {
            val srcintent = Intent(this, Calculation::class.java)
            startActivity(srcintent)
        }
    }
    }

