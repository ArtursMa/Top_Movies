package com.example.topmovies.data.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MovieDb::class], version = 1)
abstract class MovieDb:RoomDatabase() {
   abstract fun getDao():MovieDao
    companion object{
        private const val DB_NAME = "MovieDB"
        private var db:MovieDb? = null
        private val LOCK = Any()
fun getInstance(context: Context):MovieDb{
    synchronized(LOCK){
        db?.let { return it }
        val instance = Room.databaseBuilder(context,MovieDb::class.java, DB_NAME).build()
        db = instance
return instance



    }

}
    }


}