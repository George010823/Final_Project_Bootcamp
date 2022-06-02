package com.android.example.finalprojectbootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import com.android.example.finalprojectbootcamp.databinding.SplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: SplashBinding
    private val delayed:Long = 3300

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.splash)
        binding = SplashBinding.inflate(layoutInflater) //VIEWBINDING SOLO PARA VINCULACION DE VISTAS
        setContentView(binding.root)

        handler()
        //LA SIGUIENTE LINEA DE CODIGO SERVIRIA PARA ACCEDER A LA VISTA DEL LOYOUT
        //binding.splash.setOnClickListener{(handler())}
    }

    private fun handler(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, delayed)
    }
}