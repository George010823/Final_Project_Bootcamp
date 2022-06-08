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
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)

        binding.btnLogin.setOnClickListener{openSearchActivity()}

        setContentView(binding.root) //LO ULTIMO EN GUARACHA
        //setContentView(R.layout.login) ANTES


    }
    private fun openSearchActivity(){

        Toast.makeText(this, "si pasa por aca", Toast.LENGTH_LONG).show()
        Log.i("INFO", "BOTON LOGIN")
        val goSearch = Intent(this, SearchActivity::class.java)
        startActivity(goSearch)
        }
}
