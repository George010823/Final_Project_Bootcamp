package com.android.example.finalprojectbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.finalprojectbootcamp.adapter.MovieAdapter
import com.android.example.finalprojectbootcamp.data.MoviesProvider
import com.android.example.finalprojectbootcamp.databinding.SearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: SearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = SearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        seleccionarItemBar()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.listPeliculas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MovieAdapter(MoviesProvider.movieList)
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
