package com.android.example.finalprojectbootcamp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.example.finalprojectbootcamp.Movie
import com.android.example.finalprojectbootcamp.R
import com.bumptech.glide.Glide

class MovieViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val imageMovie: ImageView = view.findViewById(R.id.imavieMovie)
    private val titleMovie: TextView = view.findViewById(R.id.texvieTitle)
    private val yearMovie: TextView = view.findViewById(R.id.texvieYear)
    private val castMovie: TextView = view.findViewById(R.id.texvieCast)

    fun render(movieModel: Movie){
        Glide.with(imageMovie.context).load(movieModel.image).into(imageMovie)
        titleMovie.text = movieModel.title
        yearMovie.text = movieModel.year.toString()
        castMovie.text = movieModel.cast
    }
}