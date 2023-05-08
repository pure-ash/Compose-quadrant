package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FourCard()
                }
            }
        }
    }
}

@Composable
fun FourCard() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(color = Color(0xFFEADDFF), title = stringResource(R.string.title_1), paragraph = stringResource(
                            R.string.paragrah_1), modifier = Modifier.weight(1f))
            QuadrantCard(color = Color(0xFFD0BCFF), title = stringResource(R.string.title_2), paragraph = stringResource(
                            R.string.paragraph_2), modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(color = Color(0xFFB69DF8), title = stringResource(R.string.title_3), paragraph = stringResource(
                            R.string.paragraph_3), modifier = Modifier.weight(1f))
            QuadrantCard(color = Color(0xFFF6EDFF), title = stringResource(R.string.title_4), paragraph = stringResource(
                            R.string.paragraph_4), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantCard(color: Color, title: String, paragraph: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp)
        , verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = paragraph, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        FourCard()
    }
}