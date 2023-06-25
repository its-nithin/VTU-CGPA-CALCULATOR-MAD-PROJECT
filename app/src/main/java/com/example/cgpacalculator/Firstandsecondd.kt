package com.example.cgpacalculator

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Firstandsecondd : AppCompatActivity() {
    private lateinit var f11sub:EditText
    private lateinit var f12sub:EditText
    private lateinit var f13sub:EditText
    private lateinit var f14sub:EditText
    private lateinit var f15sub:EditText
    private lateinit var f16sub:EditText
    private lateinit var f17sub:EditText
    private lateinit var f18sub:EditText
    private lateinit var firstresult: TextView
    private lateinit var firstcalculate:Button
    private lateinit var back:Button
    private lateinit var home:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phychem)
        f11sub=findViewById(R.id.text11)
        f12sub=findViewById(R.id.text12)
        f13sub=findViewById(R.id.text13)
        f14sub=findViewById(R.id.text14)
        f15sub=findViewById(R.id.text15)
        f16sub=findViewById(R.id.text16)
        f17sub=findViewById(R.id.text17)
        f18sub=findViewById(R.id.text18)
        firstcalculate=findViewById(R.id.calculate11)
        firstresult=findViewById(R.id.result11)
        back=findViewById(R.id.back3)
        home=findViewById((R.id.home1))
        home.setOnClickListener {
            val srcintent = Intent(this, MainActivity::class.java)
            startActivity(srcintent)
        }
        back.setOnClickListener {
            val srcintent = Intent(this, Calculation::class.java)
            startActivity(srcintent)
        }
        firstcalculate.setOnClickListener{
            var a=f11sub.text.toString().trim().toInt()
            var b=f12sub.text.toString().trim().toInt()
            var c=f13sub.text.toString().trim().toInt()
            var d=f14sub.text.toString().trim().toInt()
            var e=f15sub.text.toString().trim().toInt()
            var f=f16sub.text.toString().trim().toInt()
            var g=f17sub.text.toString().trim().toInt()
            var h=f18sub.text.toString().trim().toInt()
            when (a) {
                in 91..100 -> a=10
                in 81..90 -> a=9
                in 71..80 -> a=8
                in 61..70 -> a=7
                in 51..60 -> a=6
                in 41..50 -> a=5
                in 33..40 -> a=4
                in 21..32 -> a=0
                in 0..21 -> a=0
            }
            when (b) {
                in 91..100 -> b =10
                in 81..90 -> b =9
                in 71..80 -> b =8
                in 61..70 -> b =7
                in 51..60 -> b =6
                in 41..50 -> b =5
                in 33..40 -> b =4
                in 21..32 -> b =0
                in 0..21 -> b =0
            }
            when (c) {
                in 91..100 -> c  =10
                in 81..90 -> c  =9
                in 71..80 -> c  =8
                in 61..70 -> c  =7
                in 51..60 -> c  =6
                in 41..50 -> c  =5
                in 33..40 -> c  =4
                in 21..32 -> c  =0
                in 0..21 -> c  =0
            }
            when (d) {
                in 91..100 -> d  =10
                in 81..90 -> d  =9
                in 71..80 -> d  =8
                in 61..70 -> d  =7
                in 51..60 -> d  =6
                in 41..50 -> d  =5
                in 33..40 -> d  =4
                in 21..32 -> d  =0
                in 0..21 -> d  =0
            }
            when (e){
                in 91..100 -> e =10
                in 81..90 -> e=9
                in 71..80 -> e =8
                in 61..70 -> e=7
                in 51..60 -> e=6
                in 41..50 -> e=5
                in 33..40 -> e=4
                in 21..32 -> e=0
                in 0..21 -> e=0
            }
            when (f){
                in 91..100 -> f =10
                in 81..90 -> f=9
                in 71..80 -> f =8
                in 61..70 -> f=7
                in 51..60 -> f=6
                in 41..50 -> f=5
                in 33..40 -> f=4
                in 21..32 -> f=0
                in 0..21 -> f=0
            }
            when (g){
                in 91..100 -> g =10
                in 81..90 -> g=9
                in 71..80 -> g =8
                in 61..70 -> g=7
                in 51..60 -> g=6
                in 41..50 -> g=5
                in 33..40 -> g=4
                in 21..32 -> g=0
                in 0..21 -> g=0
            }
            when (h){
                in 91..100 -> h =10
                in 81..90 -> h=9
                in 71..80 -> h =8
                in 61..70 -> h=7
                in 51..60 -> h=6
                in 41..50 -> h=5
                in 33..40 -> h=4
                in 21..32 -> h=0
                in 0..21 -> h=0
            }
            val sum1=((4*a)+(4*b)+(3*c)+(3*d)+(3*e)+f+g+h)/ 20
            firstresult.text=sum1.toString()
        }
    }
}