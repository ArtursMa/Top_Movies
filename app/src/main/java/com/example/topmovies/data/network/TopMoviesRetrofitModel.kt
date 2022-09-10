package com.example.topmovies.data.network

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopMoviesRetrofitModel(
    val page: Int,
    val results: List<MovieRetrofitModel>,
    val total_pages: Int,
    val total_results: Int
) : Parcelable