package com.exercises.ThreeButtons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.exercises.ThreeButtons.ui.theme.ThreeButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThreeButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ThreeButtons()
                }
            }
        }
    }
}

@Composable
fun ThreeButtons() {
}

@Composable
fun Activity1(text: String,
              color: Int,
              onclick: (color: Color) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterVertically)) {
        MyButton(color = Color.Red, text = "Red") {
            onclick(Color.Red)
        }
        MyButton(color = Color.Green, text = "Green") {
            onclick(Color.Red)
        }
        MyButton(color = Color.Blue, text = "Blue") {
            onclick(Color.Red)
        }
    }
}

@Composable
fun Activity2(text: String,
              color: Int,
              onclick: (color: Color) -> Unit) {
    var value by rememberSaveable { mutableStateOf(text) }
    Row {

    }
}

@Composable
fun MyButton(color:Color, text:String, onclick: () -> Unit) {
    Button(onClick = onclick,
        modifier = Modifier.size(width = 120.dp, height = 40.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        )
    ) {
        Text(text = text, color = Color.White)
    }
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThreeButtonsTheme {
        Greeting("Android")
    }
}
 */