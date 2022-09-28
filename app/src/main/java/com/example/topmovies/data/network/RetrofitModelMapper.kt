package com.example.topmovies.data.network

import com.example.topmovies.domain.MovieModel

class RetrofitModelMapper {

   companion object{
       fun getMovieModel(retrofitModel:MovieRetrofitModel):MovieModel{
           return MovieModel(retrofitModel.adult,retrofitModel.backdrop_path,retrofitModel.genre_ids,
               retrofitModel.id,retrofitModel.original_language,retrofitModel.original_title,retrofitModel.overview,
               retrofitModel.popularity,retrofitModel.poster_path,retrofitModel.release_date,retrofitModel.title,
               retrofitModel.video,retrofitModel.vote_average,retrofitModel.vote_count)

       }
   }

}