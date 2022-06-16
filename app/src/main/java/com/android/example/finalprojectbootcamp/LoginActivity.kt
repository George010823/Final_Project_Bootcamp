package com.android.example.finalprojectbootcamp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.example.finalprojectbootcamp.databinding.LoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme_splashsTheme)
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)

        setContentView(binding.root) //LO ULTIMO EN GUARACHA
        //setContentView(R.layout.login) ANTES
        binding.btnLogin.setOnClickListener{openSearchActivity()}
    }

    private fun openSearchActivity(){
        val goSearch = Intent(this, SearchActivity::class.java)
        startActivity(goSearch)
        }
}
