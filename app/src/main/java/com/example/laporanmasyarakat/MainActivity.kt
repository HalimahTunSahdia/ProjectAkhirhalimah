package com.example.laporanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var btnjam: ImageButton
    private lateinit var btntanggal: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_laporan)


        btnjam = findViewById(R.id.btnJam)
        btnjam.setOnClickListener {
            startActivity(Intent(this,listkebakaranActivity2::class.java))
        }
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_laporan)


        btntanggal = findViewById(R.id.btnTanggal)
        btntanggal.setOnClickListener {
            startActivity(Intent(this,listkebakaranActivity2::class.java))
    }
}
    }