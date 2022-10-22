package com.example.topmovies.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.topmovies.databinding.StartAppFragmentBinding
import android.net.NetworkInfo

import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.topmovies.R


class StartFragment:Fragment() {
    private lateinit var startFragmentBinding:StartAppFragmentBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        startFragmentBinding = StartAppFragmentBinding.inflate(layoutInflater,container,false)
        startFragmentBinding.myTopMoviesButtob.setOnClickListener(View.OnClickListener {

        })
        startFragmentBinding.topMoviesButton.setOnClickListener(View.OnClickListener {
            if(isInternetAvailable(requireContext())){
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null).
                add(R.id.fragmentContainerView,MainPageFragment.getTopMoviesFragmentInstance()).commit()

            }else
            {
                Toast.makeText(requireContext(),"Please connect your device to the internet",
                    Toast.LENGTH_LONG).show()

            }





        })





        return startFragmentBinding.root
    }


    private fun isInternetAvailable(context: Context): Boolean {
        var result = false
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val networkCapabilities = connectivityManager.activeNetwork ?: return false
            val actNw =
                connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
            result = when {
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else {
            connectivityManager.run {
                connectivityManager.activeNetworkInfo?.run {
                    result = when (type) {
                        ConnectivityManager.TYPE_WIFI -> true
                        ConnectivityManager.TYPE_MOBILE -> true
                        ConnectivityManager.TYPE_ETHERNET -> true
                        else -> false
                    }

                }
            }
        }

        return result
    }

    }



