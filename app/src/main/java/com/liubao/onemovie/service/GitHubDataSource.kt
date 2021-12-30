package com.liubao.onemovie.service

import com.liubao.onemovie.model.Repo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class GitHubDataSource(
    val ioDispatcher: CoroutineDispatcher,
    val service: GitHubService
) {
    suspend fun test() = withContext(ioDispatcher) {
        with(service.listRepos("bao").execute()) {
            if (this.isSuccessful) {
                Result.success(this.body() ?: emptyList())
            } else {
                Result.failure(Exception(this.errorBody()?.toString()))
            }
        }
    }
}