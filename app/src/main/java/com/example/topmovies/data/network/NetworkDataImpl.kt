package com.example.topmovies.data.network

import com.example.topmovies.domain.MovieModel
import com.example.topmovies.domain.TopMoviesRepository

class NetworkDataImpl:TopMoviesRepository {
    override fun addToMyTop(movieModel: MovieModel) {
        
    }

    override fun deleteFromMyTop(movieModel: MovieModel) {

    }

    override fun findByName(name: String) {

    }

    override suspend fun getTopMovies(): List<MovieModel> {
        val retrofit = RetrofitService.getRetrofitInstance().create(TopMoviesInterface::class.java)
        val response = retrofit.getTopMovies().results
        val responseMovieModel = ArrayList<MovieModel>()
        for(n in response){
            responseMovieModel.add(MovieModel(n.id,n.title,n.overview,n.poster_path))

        }
        return responseMovieModel


    }
}