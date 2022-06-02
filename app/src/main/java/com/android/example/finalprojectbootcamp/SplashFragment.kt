package com.android.example.finalprojectbootcamp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import com.android.example.finalprojectbootcamp.databinding.SplashBinding

class SplashFragment : Fragment() {
    private lateinit var binding: SplashBinding
    private val delayed:Long = 3300
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

        handler()
    }
    private fun handler(){
        Handler(Looper.getMainLooper()).postDelayed({
        }, delayed)
    }
}