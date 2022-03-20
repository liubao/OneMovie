package com.liubao.onemovie.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.liubao.onemovie.services.MovieService
import com.liubao.onemovie.services.response.SearchMovieResponse
import kotlinx.coroutines.CoroutineDispatcher

class HomeViewModel(
    val ioDispatchers: CoroutineDispatcher,
    val apiKey: String, val service: MovieService
) : ViewModel() {

    val searchResult = liveData<Result<SearchMovieResponse>>(ioDispatchers) {
        val response: SearchMovieResponse? = service.search(apiKey, "2")
        if (response == null) {
            emit(Result.failure(Exception()))
        } else {
            emit(Result.success(response))
        }
    }

    fun search(word: String): LiveData<Result<SearchMovieResponse?>> {
        val response = service.search(apiKey, word)


    }

}