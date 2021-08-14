package com.joseph18.ifubaya.advnative01tugasvcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Albert 160418047 hadir", Toast.LENGTH_SHORT).show()
    }
}