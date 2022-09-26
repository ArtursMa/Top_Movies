package com.example.topmovies.domain

<<<<<<<<< Temporary merge branch 1
data class MovieModel(val id:Int,val title:String,val genre:String,val movieDescription:String,val posterURI:String)
=========
data class MovieModel(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)
>>>>>>>>> Temporary merge branch 2
