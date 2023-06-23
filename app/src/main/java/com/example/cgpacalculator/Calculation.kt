package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Calculation: AppCompatActivity() {
    private lateinit var phy:Button
    private lateinit var chem:Button
    private lateinit var third:Button
    private lateinit var fourthh:Button
    private lateinit var fifthh:Button
    private lateinit var sixthh:Button
    private lateinit var seventhh:Button
    private lateinit var eighthh:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculation)
        phy=findViewById(R.id.phycycle)
        chem=findViewById(R.id.chemcycle)
        third=findViewById(R.id.thirdsem)
        fourthh=findViewById(R.id.fourthsem)
        fifthh=findViewById(R.id.fifthsem)
        sixthh=findViewById(R.id.sixthsem)
        seventhh=findViewById(R.id.seventhsem)
        eighthh=findViewById(R.id.eightsem)
        phy.setOnClickListener {
            val srcintent = Intent(this, Firstandsecondd::class.java)
            startActivity(srcintent)
        }
        chem.setOnClickListener {
            val srcintent = Intent(this, Firstandsecondd::class.java)
            startActivity(srcintent)
        }
        third.setOnClickListener {
            val srcintent = Intent(this, ThirdFourth::class.java)
            startActivity(srcintent)
        }
        fourthh.setOnClickListener {
            val srcintent = Intent(this, ThirdFourth::class.java)
            startActivity(srcintent)
        }
        fifthh.setOnClickListener {
            val srcintent = Intent(this, ThirdFourth::class.java)
            startActivity(srcintent)
        }
        sixthh.setOnClickListener {
            val srcintent = Intent(this, Sixth::class.java)
            startActivity(srcintent)
        }
        seventhh.setOnClickListener {
            val srcintent = Intent(this, Seventh::class.java)
            startActivity(srcintent)
        }
        eighthh.setOnClickListener {
            val srcintent = Intent(this, Eight::class.java)
            startActivity(srcintent)
        }
    }
}