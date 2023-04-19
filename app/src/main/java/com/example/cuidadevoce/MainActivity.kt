package com.example.cuidadevoce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.cuidadevoce.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Bt_Entrar.setOnClickListener {
            IrParaMainPricipal()
        }


        Ic_navegar.setOnClickListener {
            IrParaMainCadastro()
        }

    }


    private fun IrParaMainPricipal() {
        val MainPrincipal = Intent (this,MainPrincipal::class.java)
        startActivity(MainPrincipal)
    }

    private fun IrParaMainCadastro() {
        val MainCadastro = Intent (this,MainCasdatro::class.java)
        startActivity(MainCadastro)
    }
}