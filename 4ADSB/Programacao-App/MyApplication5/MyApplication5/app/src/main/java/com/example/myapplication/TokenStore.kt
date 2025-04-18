package com.example.myapplication

import android.content.Context
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

private val Context.tokenStore by preferencesDataStore(name = "tokenStore")

object TokenStore {
    private val TOKEN_KEY = stringPreferencesKey(
        name = "JWT_TOKEN"
    )

    //suspend fun
}