package com.example.pokedex_jetpackcompose.repository

import com.example.pokedex_jetpackcompose.api.PokemonApi
import com.example.pokedex_jetpackcompose.models.PokemonList
import com.example.pokedex_jetpackcompose.utils.NetworkResult
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api:PokemonApi
) {

    suspend fun getPokemonList(limit:Int,offset:Int):NetworkResult<PokemonList>{
        val response = try {
            api.getPokemonList(limit,offset)
        }catch (e:Exception){
            return NetworkResult.Error("An error occured.")
        }
        return NetworkResult.Success(response)
    }


}