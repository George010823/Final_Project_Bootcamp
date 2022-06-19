package com.android.example.finalprojectbootcamp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.example.finalprojectbootcamp.adapter.MovieAdapter
import com.android.example.finalprojectbootcamp.data.MoviesProvider
import com.android.example.finalprojectbootcamp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Toast.makeText(context, "FRAGMENTSEARCH", LENGTH_LONG).show()

        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        Log.i("INFO", "INICIAR RECYCLERVIEW")

        binding.listPeliculas.layoutManager = LinearLayoutManager(context)
        binding.listPeliculas.adapter = MovieAdapter(MoviesProvider.movieList)
    }
}