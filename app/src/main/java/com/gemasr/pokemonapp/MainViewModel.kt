package com.gemasr.pokemonapp

import androidx.lifecycle.ViewModel
import com.gemasr.pokemonapp.domain.GetPokemonUseCase
import com.gemasr.pokemonapp.domain.Pokemon
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.subjects.BehaviorSubject

class MainViewModel(val getPokemonUseCase: GetPokemonUseCase): ViewModel() {

    val pokemons:BehaviorSubject<List<Pokemon>> = BehaviorSubject.create()

    private val compositeDisposable = CompositeDisposable()

    fun loadList() {
        val disposable =  getPokemonUseCase.getPokemons().subscribe ({
               pokemons.onNext(it)
        }, {

        })

        compositeDisposable.add(disposable)
    }
}