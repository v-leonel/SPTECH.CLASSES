package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    val token = MutableStateFlow("")
    val musicas = mutableStateListOf<Musica>()
    var isLoading by mutableStateOf(false)
    private set

    fun loadMusicas(token: String){
        val musicasApi = RetrofitConfig
            .instance
            .create(MusicaService::class.java)


        viewModelScope.launch (Dispatchers.IO){
            isLoading = true

            try{
                val response = musicasApi.listaMusicas(token)
                if(response.isSuccessful){
                    musicas.addAll(response.body() ?: emptyList())
                }
            } catch (e: Exception){
                System.out.println(e)
            }


            isLoading = false
        }
    }

    fun login() = viewModelScope.launch {
        val loginApi = RetrofitConfig
            .instance
            .create(AuthService::class.java)

        val loginRequest = LoginRequest(
            "username",
            "password"
        )

        try {
            val response = loginApi.login(loginRequest)
            if (response.isSuccessful){
                token.value = response.body()!!.token
            }
        }catch (e: Exception){
            System.out.println(e)
        }
    }
}