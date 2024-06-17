package com.example.pokedex_jetpackcompose.pokemonViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex_jetpackcompose.api.PokemonApi
import com.example.pokedex_jetpackcompose.models.MappedData
import com.example.pokedex_jetpackcompose.models.PokemonList
import com.example.pokedex_jetpackcompose.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val api : PokemonApi
)  : ViewModel() {

    private val _pokemonNameState = MutableStateFlow<NetworkResult<ArrayList<MappedData>>>(NetworkResult.Loading())
    val pokemonNameState:StateFlow<NetworkResult<ArrayList<MappedData>>> get () = _pokemonNameState


    fun getPokemonList(){
        viewModelScope.launch {



        }
    }




}