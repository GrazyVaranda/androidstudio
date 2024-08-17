package br.com.androidstudio.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Main()
        }
    }
}

@Composable
fun Main(){
    Column {
        Column {
            Text("Chamada 3-DS:")
        }
        Text( "Gabriel Andrade")
        Text( "Grazielly Varanda")
        Text( "Gustavo Mendonça")
        Text( "Rafael Raposo")
        Text( "Sarah Nicacio")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Main()
}