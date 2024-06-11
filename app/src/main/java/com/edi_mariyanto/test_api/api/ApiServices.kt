package com.edi_mariyanto.test_api.api

import com.example.example.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    @GET("users")
    fun getUser(): Call<List<UserResponse>>
}