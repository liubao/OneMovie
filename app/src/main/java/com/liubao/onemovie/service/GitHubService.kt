package com.liubao.onemovie.service

import com.liubao.onemovie.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user: String?): List<Repo>
}