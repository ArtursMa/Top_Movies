package com.example.topmovies.domain

class DeleteFromMyTop(private val repository: TopMoviesRepository) {
    fun deleteFromMyTop(movieModel: MovieModel){
        repository.deleteFromMyTop(movieModel)
    }
}