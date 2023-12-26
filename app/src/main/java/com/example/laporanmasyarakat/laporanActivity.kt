package com.example.laporanmasyarakat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class laporanActivity : AppCompatActivity() {
    private lateinit var btnlaporan: Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)


        btnlaporan = findViewById(R.id.btnlaporan)
        btnlaporan.setOnClickListener {
            startActivity(Intent(this, listkebakaranActivity2::class.java))
        }


    }
}