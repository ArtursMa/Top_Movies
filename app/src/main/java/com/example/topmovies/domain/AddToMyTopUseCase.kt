package com.example.topmovies.domain

class AddToMyTopUseCase(private val repository: TopMoviesRepository) {
    fun addToMyTopUSeCase(movieModel: MovieModel){
        repository.addToMyTop(movieModel)

    }
}