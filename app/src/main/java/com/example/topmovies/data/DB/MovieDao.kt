package com.example.topmovies.data.DB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface MovieDao {
    @Insert
    suspend fun insertMovie(movieDBModel: MovieDBModel)
    @Delete
    suspend fun deleteMovie(movieDBModel: MovieDBModel)
}