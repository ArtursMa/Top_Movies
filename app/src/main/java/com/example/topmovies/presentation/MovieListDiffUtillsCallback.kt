package com.example.topmovies.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.topmovies.domain.MovieModel

class MovieListDiffUtillsCallback():DiffUtil.ItemCallback<MovieModel>() {
    override fun areItemsTheSame(oldItem: MovieModel, newItem: MovieModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MovieModel, newItem: MovieModel): Boolean {
        return oldItem == newItem
    }

}