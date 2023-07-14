package com.example.sicah4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val btnpass = findViewById<Button>(R.id.btnPass)
        btnpass.setOnClickListener {
            btnpass()
        }
    }
    private fun btnpass()
    {
        val i = Intent(this, ForggetPass::class.java)
        startActivity(i)
    }
}