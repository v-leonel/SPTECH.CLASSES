package com.example.myapplication

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface MusicaService{

    @GET("/musicas")
    suspend fun listaMusicas(
        @Header("Authorization") token: String
    ) : Response<List<Musica>>

}

interface AuthService{

    @POST("/login")
    suspend fun login(
        @Body loginRequest : LoginRequest
    ) : Response<LoginResponse>

}

data class LoginRequest(
    val usename: String,
    val password: String
)

data class LoginResponse(
    val token: String
)

object RetrofitConfig {

    private const val BASE_URL = "https://p4xs6v3upzgrvazzezs2ni2sbm0kxvuh.lambda-url.us-east-1.on.aws"

    val instance = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}