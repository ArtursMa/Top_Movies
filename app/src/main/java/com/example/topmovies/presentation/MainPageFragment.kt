package com.example.topmovies.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.topmovies.data.network.NetworkDataImpl

import com.example.topmovies.databinding.MainPageFragmentBinding
import com.example.topmovies.domain.GetTopMoviesUSeCse
import com.example.topmovies.domain.MovieModel

class MainPageFragment: Fragment() {
    private lateinit var binding:MainPageFragmentBinding
    private val viewModel by viewModels<TopMoviesVieModel> {
        TopMoviesVieModel.TopMoviesViewModelFactory(GetTopMoviesUSeCse(NetworkDataImpl()))
    }




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainPageFragmentBinding.inflate(inflater,container,false)
        viewModel.getTopMovies()
        val recyclerView = binding.recyclerView
        val adapter = MovieListAdapter()
//        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        recyclerView.adapter = adapter
        viewModel.topMovieLiveData.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })





        return binding.root
    }

}