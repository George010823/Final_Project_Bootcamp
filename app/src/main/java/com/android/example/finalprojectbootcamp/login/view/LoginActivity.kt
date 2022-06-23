package com.android.example.finalprojectbootcamp.login.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.example.finalprojectbootcamp.R
import com.android.example.finalprojectbootcamp.NavigationControlActivity
import com.android.example.finalprojectbootcamp.databinding.LoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme_splashsTheme)
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnLogin.setOnClickListener{openSearchActivity()}
    }

    private fun openSearchActivity(){
        val goSearch = Intent(this, NavigationControlActivity::class.java)
        startActivity(goSearch)
    }

    private fun showError(){
        Toast.makeText(this, "NO SE PUDO AUTENTICAR...", Toast.LENGTH_SHORT).show()
    }

}
