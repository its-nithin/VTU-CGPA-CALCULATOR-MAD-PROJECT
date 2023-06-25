package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Eight : AppCompatActivity() {
    private lateinit var firstt: EditText
    private lateinit var secondd: EditText
    private lateinit var thirdd: EditText
    private lateinit var fourthh: EditText
    private lateinit var fifthh: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    private lateinit var back:Button
    private lateinit var home:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eight)
        firstt = findViewById(R.id.tttttt1)
        secondd = findViewById(R.id.tttttt2)
        thirdd = findViewById(R.id.tttttt3)
        fourthh = findViewById(R.id.tttttt4)
        fifthh = findViewById(R.id.tttttt5)
        calculatee = findViewById(R.id.calculate6)
        resultt = findViewById(R.id.result5)
        back=findViewById(R.id.back8)
        home=findViewById((R.id.home6))
        home.setOnClickListener {
            val srcintent = Intent(this, MainActivity::class.java)
            startActivity(srcintent)
        }
        back.setOnClickListener {
            val srcintent = Intent(this, Calculation::class.java)
            startActivity(srcintent)
        }
        calculatee.setOnClickListener {
            var a = firstt.text.toString().trim().toInt()
            var b = secondd.text.toString().trim().toInt()
            var c = thirdd.text.toString().trim().toInt()
            var d = fourthh.text.toString().trim().toInt()
            var e = fifthh.text.toString().trim().toInt()
            when (a) {
                in 91..100 -> a = 10
                in 81..90 -> a = 9
                in 71..80 -> a = 8
                in 61..70 -> a = 7
                in 51..60 -> a = 6
                in 41..50 -> a = 5
                in 33..40 -> a = 4
                in 21..32 -> a = 0
                in 0..21 -> a = 0
            }
            when (b) {
                in 91..100 -> b = 10
                in 81..90 -> b = 9
                in 71..80 -> b = 8
                in 61..70 -> b = 7
                in 51..60 -> b = 6
                in 41..50 -> b = 5
                in 33..40 -> b = 4
                in 21..32 -> b = 0
                in 0..21 -> b = 0
            }
            when (c) {
                in 91..100 -> c = 10
                in 81..90 -> c = 9
                in 71..80 -> c = 8
                in 61..70 -> c = 7
                in 51..60 -> c = 6
                in 41..50 -> c = 5
                in 33..40 -> c = 4
                in 21..32 -> c = 0
                in 0..21 -> c = 0
            }
            when (d) {
                in 91..100 -> d = 10
                in 81..90 -> d = 9
                in 71..80 -> d = 8
                in 61..70 -> d = 7
                in 51..60 -> d = 6
                in 41..50 -> d = 5
                in 33..40 -> d = 4
                in 21..32 -> d = 0
                in 0..21 -> d = 0
            }
            when (e) {
                in 91..100 -> e = 10
                in 81..90 -> e = 9
                in 71..80 -> e = 8
                in 61..70 -> e = 7
                in 51..60 -> e = 6
                in 41..50 -> e = 5
                in 33..40 -> e = 4
                in 21..32 -> e = 0
                in 0..21 -> e = 0
            }
            val sum=((3*a)+(3*b)+(8*c)+(1*d)+(3*e))/ 18
            resultt.text=sum.toString()
        }
    }
}