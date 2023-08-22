package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.btnLogin)
        val us = findViewById<EditText>(R.id.etUsername)
        val ps = findViewById<EditText>(R.id.etPassword)


//        var uss = us.text.toString()
//        var pass = ps.text.toString()
//
//        Log.d("Value0", "$uss")
//        Log.d("Value0", "$pass")


        bt.setOnClickListener {
            val uss = us.text.toString()
            val pass = ps.text.toString()

            if(uss.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "Please input all area!!!", Toast.LENGTH_SHORT).show()
            } else {
                Log.d("Value0", "$uss")
                Log.d("Value0", "$pass")

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("us", uss)
                intent.putExtra("ps", pass)
                startActivity(intent)
            }
        }




    }
}