package com.example.topmovies.presentation

import android.database.DatabaseUtils
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter

import com.example.topmovies.databinding.MovieItemBinding
import com.example.topmovies.domain.MovieModel
import com.squareup.picasso.Picasso
import java.lang.RuntimeException


class MovieListAdapter:ListAdapter<MovieModel,MovieModelViewHolder>(MovieListDiffUtillsCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieModelViewHolder {
        val binding = when(viewType){
            MOVIE_ITEM -> MovieItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        else -> throw RuntimeException("Unknown view type")
        }

        return MovieModelViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MovieModelViewHolder, position: Int) {
        val item = getItem(position)
        val binding = holder.viewBinding
        when(binding){
            is MovieItemBinding ->{
//                binding.titleTextView.text = item.title
              Picasso.get().load("https://image.tmdb.org/t/p/w500/"+item.poster_path).into(binding.imageView);

            }


        }




    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        if (item is MovieModel){
            return MOVIE_ITEM
        }
        else throw RuntimeException("Unknown View Type")
    }
    companion object{
        private const val MOVIE_ITEM = 100
    }
}