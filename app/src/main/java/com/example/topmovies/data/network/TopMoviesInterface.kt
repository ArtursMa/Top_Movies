package com.example.topmovies.data.network

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface TopMoviesInterface {
@GET("3/movie/popular?api_key=2b64f38c32a0838fcd900144d8e09738&language=en-US&page=1")
 suspend fun getTopMovies():TopMoviesRetrofitModel




}