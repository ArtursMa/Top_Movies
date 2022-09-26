package com.example.topmovies.domain

interface TopMoviesRepository {
    fun addToMyTop(movieModel: MovieModel)
    fun deleteFromMyTop(movieModel: MovieModel)
    fun findByName(name:String)
    suspend fun getTopMovies():List<MovieModel>


}