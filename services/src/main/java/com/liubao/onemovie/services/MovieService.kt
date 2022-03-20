package com.liubao.onemovie.services

import com.liubao.onemovie.services.entity.MovieDetailEntity
import com.liubao.onemovie.services.response.GetImageConfigurationResponse
import com.liubao.onemovie.services.response.GetMovieImagesResponse
import com.liubao.onemovie.services.response.SearchMovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("configuration")
    suspend fun configurations(): GetImageConfigurationResponse

    //MOVIE SEARCH AUTOCOMPLETE
    @GET("search/movie")
    suspend fun search(
        @Query("api_key") apiKey: String?,
        @Query("query") query: String?,
    ): SearchMovieResponse

    //MOVIE DETAIL
    @GET("movie/{id}")
    suspend fun movieDetails(
        @Query("api_key") apiKey: String?,
        @Path("id") movieID: Int,
    ): MovieDetailEntity

    //MOVIE IMAGES
    @GET("movie/{id}/images")
    suspend fun movieImages(
        @Query("api_key") apiKey: String?,
        @Path("id") movieID: Int,
    ): GetMovieImagesResponse

}