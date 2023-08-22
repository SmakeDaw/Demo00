package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val usern = findViewById<EditText>(R.id.etNewUsername)
        val passn = findViewById<EditText>(R.id.etNewPassword)
        val bt2 = findViewById<Button>(R.id.btnRegister)

        val usn : String? = intent.getStringExtra("us")
        val pas : String? = intent.getStringExtra("ps")

        Log.d("Value", "$usn")
        Log.d("Value", "$pas")

        usern.setText(usn.toString())
        passn.setText(pas.toString())

        bt2.setOnClickListener {

        }

    }
}