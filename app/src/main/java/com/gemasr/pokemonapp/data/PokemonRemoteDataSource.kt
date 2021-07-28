package com.gemasr.pokemonapp.data

class PokemonRemoteDataSource(val pokemonApi: PokemonApi) {

    fun getAllPokemons() = pokemonApi.getListOfPokemon().map { it.result }
}