package com.liubao.onemovie.ui.home

import androidx.lifecycle.*
import com.liubao.onemovie.model.Repo
import com.liubao.onemovie.service.GitHubDataSource

class HomeViewModel(val gitHubDataSource: GitHubDataSource) : ViewModel() {

    val text = liveData<List<Repo>> {
        gitHubDataSource.test().apply {
            onSuccess { emit(this.getOrDefault(emptyList())) }
            onFailure { emit(emptyList()) }
        }
    }

}