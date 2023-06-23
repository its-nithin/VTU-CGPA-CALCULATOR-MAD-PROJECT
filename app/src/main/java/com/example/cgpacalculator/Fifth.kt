package com.example.cgpacalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Fifth : AppCompatActivity() {
    private lateinit var firstt: EditText
    private lateinit var secondd: EditText
    private lateinit var thirdd: EditText
    private lateinit var fourthh: EditText
    private lateinit var fifthh: EditText
    private lateinit var sixthh: EditText
    private lateinit var seventhh: EditText
    private lateinit var eighthh: EditText
    private lateinit var ninethh: EditText
    private lateinit var resultt: TextView
    private lateinit var calculatee: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fifth)
        firstt = findViewById(R.id.ttt1)
        secondd = findViewById(R.id.ttt2)
        thirdd = findViewById(R.id.ttt3)
        fourthh = findViewById(R.id.ttt4)
        fifthh = findViewById(R.id.ttt5)
        sixthh = findViewById(R.id.ttt6)
        seventhh = findViewById(R.id.ttt7)
        eighthh = findViewById(R.id.ttt8)
        ninethh = findViewById(R.id.ttt9)
        calculatee = findViewById(R.id.calculate3)
        resultt = findViewById(R.id.result2)
        calculatee.setOnClickListener {
            var a = firstt.text.toString().trim().toInt()
            var b = secondd.text.toString().trim().toInt()
            var c = thirdd.text.toString().trim().toInt()
            var d = fourthh.text.toString().trim().toInt()
            var e = fifthh.text.toString().trim().toInt()
            var f = sixthh.text.toString().trim().toInt()
            var g = seventhh.text.toString().trim().toInt()
            var h = eighthh.text.toString().trim().toInt()
            var i = ninethh.text.toString().trim().toInt()
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
            when (f) {
                in 91..100 -> f = 10
                in 81..90 -> f = 9
                in 71..80 -> f = 8
                in 61..70 -> f = 7
                in 51..60 -> f = 6
                in 41..50 -> f = 5
                in 33..40 -> f = 4
                in 21..32 -> f = 0
                in 0..21 -> f = 0
            }
            when (g) {
                in 91..100 -> g = 10
                in 81..90 -> g = 9
                in 71..80 -> g = 8
                in 61..70 -> g = 7
                in 51..60 -> g = 6
                in 41..50 -> g = 5
                in 33..40 -> g = 4
                in 21..32 -> g = 0
                in 0..21 -> g = 0
            }
            when (h) {
                in 91..100 -> h = 10
                in 81..90 -> h = 9
                in 71..80 -> h = 8
                in 61..70 -> h = 7
                in 51..60 -> h = 6
                in 41..50 -> h = 5
                in 33..40 -> h = 4
                in 21..32 -> h = 0
                in 0..21 -> h = 0
            }
            when (i) {
                in 91..100 -> i = 10
                in 81..90 -> i = 9
                in 71..80 -> i = 8
                in 61..70 -> i = 7
                in 51..60 -> i = 6
                in 41..50 -> i = 5
                in 33..40 -> i = 4
                in 21..32 -> i = 0
                in 0..21 -> i = 0
            }
            val sum=((3*a)+(4*b)+(4*c)+(3*d)+(3*e)+(3*f)+(2*g)+(2*h)+(1*h))/ 25
            resultt.text=sum.toString()
        }
    }
}
