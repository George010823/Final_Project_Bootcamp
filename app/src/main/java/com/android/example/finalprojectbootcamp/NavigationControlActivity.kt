package com.android.example.finalprojectbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import com.android.example.finalprojectbootcamp.databinding.NavigationcontrolBinding
import com.android.example.finalprojectbootcamp.home.view.HomeFragment
import com.android.example.finalprojectbootcamp.play.view.PlayFragment
import com.android.example.finalprojectbootcamp.search.view.SearchFragment
import com.android.example.finalprojectbootcamp.user.view.UserFragment

class NavigationControlActivity : AppCompatActivity() {
    private lateinit var binding: NavigationcontrolBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = NavigationcontrolBinding.inflate(layoutInflater)
        setContentView(binding.root)

        seleccionarItemBar()
    }

    private fun seleccionarItemBar() {
        binding.navigationView.setOnItemSelectedListener {
                menuItem ->
            when(menuItem.itemId){
                R.id.destination_home ->{
                    val fragment = HomeFragment()
                    openFragment(fragment)
                    true
                }
                R.id.destination_search ->{
                    val fragment = SearchFragment()
                    openFragment(fragment)
                    true
                }
                R.id.destination_play ->{
                    val fragment = PlayFragment()
                    openFragment(fragment)
                    true
                }
                R.id.destination_user ->{
                    val fragment = UserFragment()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.myNavHostFragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
