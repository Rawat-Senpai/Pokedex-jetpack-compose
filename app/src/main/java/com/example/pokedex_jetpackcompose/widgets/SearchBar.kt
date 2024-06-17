package com.example.pokedex_jetpackcompose.widgets


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun SearchBar() {

    var searchText by remember {
        mutableStateOf("")
    }

    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = MaterialTheme.shapes.small,
        color= MaterialTheme.colorScheme.surface,
        shadowElevation =  4.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            TextField(value = searchText, onValueChange = { searchText = it },
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Transparent),
                singleLine = true,
                placeholder = { Text(text = "Search pokemon") }
            )


            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Search
                    , contentDescription = "search icons")
            }
        }
    }



}