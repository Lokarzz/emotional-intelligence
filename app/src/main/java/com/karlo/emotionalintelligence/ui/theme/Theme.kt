package com.karlo.emotionalintelligence.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color



private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    onPrimary = Purple1,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Color.White
)

@Composable
fun EmotionalIntelligenceTheme(
    content: @Composable () -> Unit
) {

    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}