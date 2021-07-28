package com.gemasr.pokemonapp.domain

import com.gemasr.pokemonapp.data.PokemonRemoteDataSource


class GetPokemonUseCase(val dataSource: PokemonRemoteDataSource) {

    fun getPokemons() = dataSource.getAllPokemons()
        .map { list ->
            list.map { item ->
                Pokemon(
                    name = item.name,
                    url = item.url
                )
            }
        }
}
