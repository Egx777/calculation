package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val umnbtn = findViewById<Button>(R.id.button1)
        val delbtn = findViewById<Button>(R.id.button2)
        val pusbtn = findViewById<Button>(R.id.button3)
        val textV1 = findViewById<TextView>(R.id.textView1)
        val textV2 = findViewById<TextView>(R.id.textView2)
        val textV3 = findViewById<TextView>(R.id.textView3)
        val textV4 = findViewById<TextView>(R.id.textView4)
        val textV5 = findViewById<TextView>(R.id.textView5)
        val editT1 = findViewById<EditText>(R.id.EditText1)
        val editT2 = findViewById<EditText>(R.id.EditText2)

        umnbtn.setOnClickListener {

            textV1.text = "${editT2.text.toString().toInt() * editT1.text.toString().toInt()}"
        }

        delbtn.setOnClickListener {

            textV1.text = "${editT2.text.toString().toInt() - editT1.text.toString().toInt()}"
        }

        pusbtn.setOnClickListener {

            textV1.text = "${editT2.text.toString().toInt() + editT1.text.toString().toInt()}"
        }

        Log.d("LogActivity", "${textV1.text.toString()} - onCreate")

    }


    override fun onStart() {
        super.onStart()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onStart")
    }

    override fun onResume() {
        super.onResume()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onResume")
    }

    override fun onPause() {
        super.onPause()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onPause")
    }

    override fun onRestart() {
        super.onRestart()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onRestart")
    }

    override fun onStop() {
        super.onStop()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        val textV = findViewById<TextView>(R.id.textView1)
        Log.d("LogActivity", "${textV.text.toString()} - onDestroy")
    }





}