package com.example.topmovies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.topmovies.databinding.MovieFragmentBinding

class MovieFragment: Fragment() {
    private lateinit var binding:MovieFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MovieFragmentBinding.inflate(inflater,container,false)
        return binding.root

    }
    companion object{
        fun getMovieFragmentInstance():MovieFragment{
            return  MovieFragment()

        }
    }
}