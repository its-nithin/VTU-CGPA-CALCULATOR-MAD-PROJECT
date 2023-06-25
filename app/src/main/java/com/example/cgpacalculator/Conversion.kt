package com.example.cgpacalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class Conversion:AppCompatActivity() {
    private lateinit var ctop:EditText
    private lateinit var ptoc:EditText
    private lateinit var ctopp2:TextView
    private lateinit var ptocc2:TextView
    private lateinit var sub1:Button
    private lateinit var sub2:Button
    private lateinit var back:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conversionf)
        ctop=findViewById(R.id.ctop)
        ptoc=findViewById(R.id.ptoc)
        ctopp2=findViewById(R.id.ctop2)
        ptocc2=findViewById(R.id.ptoc2)
        sub1=findViewById(R.id.btn1)
        sub2=findViewById(R.id.btn2)
        back=findViewById(R.id.back1)
        back.setOnClickListener {
            val srcintent = Intent(this, MainActivity::class.java)
            startActivity(srcintent)
        }
        sub1.setOnClickListener{
            val msg = ctop.text.toString().toDouble()
            val result = (msg - 0.75) * 10
            ctopp2.text = result.toString()
        }
        sub2.setOnClickListener {
            val msg1 = ptoc.text.toString().toDouble()
            val result1 = msg1 / 9.5
            val formattedResult = String.format("%.2f", result1)
            ptocc2.text = formattedResult
        }


    }
}