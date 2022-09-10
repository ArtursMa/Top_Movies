package com.example.topmovies.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
  suspend  fun getRetrofitInstance():Retrofit {
    return    Retrofit.Builder().
    addConverterFactory(GsonConverterFactory.create()).
    baseUrl("https://api.themoviedb.org/").build()

    }



   

}