package com.example.laporanmasyarakat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class DashboardActivity : AppCompatActivity() {
    private lateinit var btngambar1 : ImageButton
    private lateinit var btngambar2 : ImageButton
    private lateinit var btngambar3 : ImageButton
    private lateinit var btnriwayatlaporan :Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btngambar1 = findViewById(R.id.btngambar1)
        btngambar1.setOnClickListener {
            startActivity(Intent(this, laporanActivity::class.java))
        }
        btngambar2 = findViewById(R.id.btngambar2)
        btngambar2.setOnClickListener {
            startActivity(Intent(this, laporanActivity::class.java))
        }
        btngambar3 = findViewById(R.id.btngambar3)
        btngambar3.setOnClickListener {
            startActivity(Intent(this, laporanActivity::class.java))

        }
        btnriwayatlaporan = findViewById(R.id.btnriwayatlaporan)
        btnriwayatlaporan.setOnClickListener {
            startActivity(Intent(this, riwayatActivity::class.java))

        }
    }
}