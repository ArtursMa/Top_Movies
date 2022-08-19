package com.example.topmovies.domain

class FindByNameUseCase(private val repository: TopMoviesRepository) {
    fun findByName(name:String){
        repository.findByName(name)
    }
}