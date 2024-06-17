package com.example.pokedex_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pokedex_jetpackcompose.screens.PokemonListScreens
import com.example.pokedex_jetpackcompose.ui.theme.Pokedex_jetpackComposeTheme
import com.example.pokedex_jetpackcompose.utils.Screens
import com.example.pokedex_jetpackcompose.widgets.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pokedex_jetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "pokemon_list_screen"
                ) {

                    composable(Screens.PokemonListScreen.route){
                        PokemonListScreens()
                    }


                }

            }
        }
    }
}

