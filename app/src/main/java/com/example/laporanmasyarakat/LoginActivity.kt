package com.example.laporanmasyarakat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var btnlogin : Button
    private lateinit var btnnew : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        btnlogin = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }

        btnnew = findViewById(R.id.btnnew)
        btnnew.setOnClickListener {
                startActivity(Intent(this ,RegisterActivity::class.java))
        }
    }
}