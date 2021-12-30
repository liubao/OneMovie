package com.liubao.onemovie.ui.home

import androidx.lifecycle.*
import com.liubao.onemovie.model.Repo
import com.liubao.onemovie.service.GitHubService
import com.liubao.onemovie.utils.RetrofitProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(retrofitProvider: RetrofitProvider) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
    val retrofit = retrofitProvider.provide()

    fun testService() =
        liveData<Any>(context = viewModelScope.coroutineContext + Dispatchers.IO) {
            val service = retrofit.create(GitHubService::class.java)
            service.listRepos("bao")?.execute()
            emit("")
        }


}