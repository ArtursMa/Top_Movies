package com.example.topmovies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.topmovies.databinding.MovieFragmentBinding
import com.example.topmovies.domain.MovieModel

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = arguments
        val modelTitle = bundle?.getParcelable<MovieModel>(MODEL)

        binding.testId.text = modelTitle?.title


    }

    companion object{
        const val MODEL = "model"
        fun getMovieFragmentInstance(movieModel: MovieModel):MovieFragment{


            return MovieFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(MODEL,movieModel)
                }
            }



        }
    }
}