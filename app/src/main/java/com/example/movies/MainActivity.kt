package com.example.movies
//https://rutracker.org/forum/viewtopic.php?t=6240289
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.movies.navigation.SetupNavHost
import com.example.movies.ui.theme.MoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesTheme {
                val navController = rememberNavController()
                SetupNavHost(navController = navController)
            }
        }
    }
}