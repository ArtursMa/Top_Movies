package com.example.topmovies.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.topmovies.databinding.MainPageFragmentBinding

class MainPageFragment: Fragment() {
    private lateinit var binding:MainPageFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainPageFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}