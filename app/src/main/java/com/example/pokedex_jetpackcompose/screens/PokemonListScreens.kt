package com.example.pokedex_jetpackcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

import com.example.pokedex_jetpackcompose.pokemonViewModel.PokemonViewModel
import com.example.pokedex_jetpackcompose.widgets.SearchBar

@Composable
fun PokemonListScreens(viewModel: PokemonViewModel =  ) {

    Column {

        SearchBar()

        LazyColumn {
            item (pokemonList){

            }



        }

    }


}