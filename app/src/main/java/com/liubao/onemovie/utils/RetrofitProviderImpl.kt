package com.liubao.onemovie.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProviderImpl : RetrofitProvider {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.github.com/")
        .build()

    override fun provide(): Retrofit = retrofit
}