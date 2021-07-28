package com.gemasr.pokemonapp.data

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonClient {

    private val okHttpClient = OkHttpClient.Builder().build()

    val pokemonApi = Retrofit.Builder()
        .baseUrl("https://pokeapi.api")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .run {
            create(PokemonApi::class.java)
        }

}