package com.android.example.finalprojectbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.android.example.finalprojectbootcamp.databinding.LoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.login)
        binding = DataBindingUtil.setContentView(this, R.layout.login)//DATABINDING SOLO PARA VINCULACION DE DATOS
        binding.btnLogin.setOnClickListener{
            loguearUsuario(it)
        }
    }

    private fun loguearUsuario(view: View){
        //val btnLogin = findViewById<Button>(R.id.btnLogin)
        binding.btnLogin.visibility = View.GONE
    }
}