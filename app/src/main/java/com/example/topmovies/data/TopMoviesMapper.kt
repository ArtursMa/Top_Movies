package com.example.topmovies.data

import com.example.topmovies.data.DB.MovieDBModel
import com.example.topmovies.data.network.MovieRetrofitModel
import com.example.topmovies.domain.MovieModel

class TopMoviesMapper {
    fun retrofitModelToDomainModel(movieRetrofitModel: MovieRetrofitModel): MovieModel {
        return MovieModel(movieRetrofitModel.adult,
            movieRetrofitModel.backdrop_path,movieRetrofitModel.genre_ids,movieRetrofitModel.id,
        movieRetrofitModel.original_language,movieRetrofitModel.original_title,movieRetrofitModel.overview,
        movieRetrofitModel.popularity,movieRetrofitModel.poster_path,movieRetrofitModel.release_date,
        movieRetrofitModel.title,movieRetrofitModel.video,movieRetrofitModel.vote_average,movieRetrofitModel.vote_count)


    }
    fun retrofitModelToDbModel(movieRetrofitModel: MovieRetrofitModel):MovieDBModel{
        return MovieDBModel(movieRetrofitModel.id,
            movieRetrofitModel.adult,movieRetrofitModel.backdrop_path,movieRetrofitModel.genre_ids,
            movieRetrofitModel.original_language,movieRetrofitModel.original_title,movieRetrofitModel.overview,
            movieRetrofitModel.popularity,movieRetrofitModel.poster_path,movieRetrofitModel.release_date,
            movieRetrofitModel.title,movieRetrofitModel.video,movieRetrofitModel.vote_average,movieRetrofitModel.vote_count)

    }
    fun dbModelToDomainModel(movieDBModel: MovieDBModel):MovieModel{
        return MovieModel(movieDBModel.adult,
            movieDBModel.backdrop_path,movieDBModel.genre_ids,movieDBModel.id,
            movieDBModel.original_language,movieDBModel.original_title,movieDBModel.overview,
            movieDBModel.popularity,movieDBModel.poster_path,movieDBModel.release_date,
            movieDBModel.title,movieDBModel.video,movieDBModel.vote_average,movieDBModel.vote_count)

    }
}