package com.liubao.onemovie.di

import com.liubao.onemovie.service.GitHubDataSource
import com.liubao.onemovie.service.GitHubService
import com.liubao.onemovie.ui.home.HomeViewModel
import com.liubao.onemovie.utils.RetrofitProviderImpl
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit

val NAMED_IO_DISPATCHER = named("named_io_dispatcher")

val appModule = module {
  single<Retrofit> {
    RetrofitProviderImpl().provide()
  }
  single<CoroutineDispatcher>(NAMED_IO_DISPATCHER) {
    Dispatchers.IO
  }
  factory<GitHubService> {
    get<Retrofit>().create(GitHubService::class.java)
  }
  factory {
    GitHubDataSource(ioDispatcher = get(NAMED_IO_DISPATCHER), get())
  }

  viewModel {
    HomeViewModel(get())
  }

}