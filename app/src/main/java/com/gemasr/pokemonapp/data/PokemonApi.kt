package com.gemasr.pokemonapp.data

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface PokemonApi {

    @GET("api/v2/pokemon/")
    fun getListOfPokemon(): Single<PokemonApiListResponse>

}

data class PokemonApiListResponse(
    val result: List<PokemonApiListItem>
)

data class PokemonApiListItem(
    val name: String,
    val url: String
)