package com.beatrizlopez.foodtag

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldApp()


        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScaffoldApp() {
     Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color.White,

                    //titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Image(painter= painterResource(id = R.drawable.logo_foodtag),
                        contentDescription = "FoodTag")

                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Todos los derechos reservados",
                )
            }
        },

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            LazyColumn {
                // Add a single item
                item {
                    Text(text = "FoodTag te ayuda a conocer la compatibilidad que tienes con los productos que escaneas en base a:")
                }
                item {
                    Text(text = "Valores")

                }
                item {
                    Text(text = "Alergias")
                }
                item {
                    Text(text = "Proximidad")
                }
                item {
                    Text(text = "Mucho más")
                }





            }
            Row() {
                OutlinedButton(onClick = {/*TODO*/ }) {
                    Text("Escanear")


                }
                Spacer(modifier = Modifier.width(10.dp))

                OutlinedButton(onClick = {/*TODO*/ }) {
                    Text("Perfil")
                }
            }

        }
    }
}





