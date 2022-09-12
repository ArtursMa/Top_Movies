package com.example.topmovies.presentation

import androidx.lifecycle.*
import com.example.topmovies.domain.GetTopMoviesUSeCse
import com.example.topmovies.domain.MovieModel
import com.example.topmovies.domain.TopMoviesRepository
import kotlinx.coroutines.launch

class TopMoviesVieModel(val getTopMoviesUSeCse: GetTopMoviesUSeCse):ViewModel() {

    private val _topMovieLiveData:MutableLiveData<List<MovieModel>> = MutableLiveData<List<MovieModel>>()
    val topMovieLiveData:LiveData<List<MovieModel>>
    get() = _topMovieLiveData

    fun getTopMovies(){
        viewModelScope.launch {

            _topMovieLiveData.value =  getTopMoviesUSeCse.getTopMovies()

        }
    }



class TopMoviesViewModelFactory(val getTopMoviesUSeCse: GetTopMoviesUSeCse):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(TopMoviesVieModel::class.java)){
            return TopMoviesVieModel(getTopMoviesUSeCse) as T
        }
        throw IllegalArgumentException("Wrong View Model")
    }
}
}