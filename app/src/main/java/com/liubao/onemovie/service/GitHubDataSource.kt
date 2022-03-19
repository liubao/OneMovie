package com.liubao.onemovie.service

import kotlinx.coroutines.CoroutineDispatcher

class GitHubDataSource(
    val ioDispatcher: CoroutineDispatcher,
    val service: GitHubService
) {
    suspend fun test() =
        with(service.listRepos("bao")) {
            if (!this.isNullOrEmpty()) {
                Result.success(this)
            } else {
                Result.failure(Exception("this"))
            }
        }
}