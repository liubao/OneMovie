package com.liubao.onemovie.utils

import retrofit2.Retrofit

interface RetrofitProvider {
    fun provide(): Retrofit
}
