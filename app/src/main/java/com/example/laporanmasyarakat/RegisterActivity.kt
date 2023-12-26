package com.example.laporanmasyarakat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var btnnew : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnnew = findViewById(R.id.btnnew)
        btnnew.setOnClickListener {
                startActivity(Intent(this, LoginActivity::class.java))
        }

        }

    }
