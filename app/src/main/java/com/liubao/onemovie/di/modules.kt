package com.liubao.onemovie.di

import com.liubao.onemovie.ui.home.HomeViewModel
import com.liubao.onemovie.utils.RetrofitProvider
import com.liubao.onemovie.utils.RetrofitProviderImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<RetrofitProvider> {
        RetrofitProviderImpl()
    }
    viewModel {
        HomeViewModel(get())
    }
}