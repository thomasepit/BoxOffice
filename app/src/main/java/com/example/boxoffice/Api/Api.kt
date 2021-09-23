package com.example.boxoffice.Api

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "130820b6254034f121afbcbfd29f4bef",
        @Query("language") language: String = "fr-FR",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}