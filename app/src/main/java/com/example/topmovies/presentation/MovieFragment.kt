package com.example.topmovies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.topmovies.databinding.MovieFragmentBinding
import com.example.topmovies.domain.MovieModel
import com.squareup.picasso.Picasso

class MovieFragment: Fragment() {
    private lateinit var binding:MovieFragmentBinding
    private val movieFragmentViewModel:TopMoviesVieModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bundle = arguments
        val clickedItemPosition = bundle?.getInt(CLICKED_MOVIE_KEY)

        movieFragmentViewModel.topMovieLiveData.observe(viewLifecycleOwner){
           binding.titleTeXtView.text = it[clickedItemPosition!!].title
            Picasso.get().load("https://image.tmdb.org/t/p/w500/"+it[clickedItemPosition].poster_path).into(binding.posterImageView)
            binding.overViewTextView.text = it[clickedItemPosition].overview

        }

        binding = MovieFragmentBinding.inflate(inflater,container,false)
        return binding.root

    }
    companion object{
        private const val CLICKED_MOVIE_KEY = "movie_key"
        fun getMovieFragmentInstance(clickedMovie:Int):MovieFragment{


            return  MovieFragment().apply {
                arguments = Bundle().apply {
                    putInt(CLICKED_MOVIE_KEY,clickedMovie)
                }
            }

        }
    }
}