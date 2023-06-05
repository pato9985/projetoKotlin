package com.example.cuidadevoce

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cuidadevoce.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate( layoutInflater )
        setContentView( binding.root )

        val edButtonSaberMais = binding.edButtonSaberMais
        edButtonSaberMais.setOnClickListener {
            val intent = Intent( this, MainActivity3Casdatro:: class.java)
            startActivity(intent)
        }

    }
