package com.example.topmovies.domain

class GetTopMoviesUSeCse(val repository: TopMoviesRepository) {
    suspend fun getTopMovies():List<MovieModel>{
       return repository.getTopMovies()
    }
}