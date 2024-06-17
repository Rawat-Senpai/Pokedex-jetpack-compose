package com.example.pokedex_jetpackcompose.api

import com.example.pokedex_jetpackcompose.models.PokemonList
import com.example.pokedex_jetpackcompose.models.details.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {


    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit:Int,
        @Query("offset") offset:Int
    ):PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name:String
    ): Pokemon

}