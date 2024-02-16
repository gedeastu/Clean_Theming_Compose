package com.example.cleantheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cleantheming.ui.theme.CleanThemingTheme
import com.example.cleantheming.ui.theme.LocalSpacing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Column {
        Text(text = "Hello World")
        Spacer(modifier = Modifier.height(LocalSpacing.current.extraSmall))
        Text( text = "Gede Astu Nugraha", modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CleanThemingTheme {
        Main()
    }
}