package com.karlo.emotionalintelligence.ui.composables.preview

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.karlo.emotionalintelligence.ui.theme.EmotionalIntelligenceTheme


// Preview compose use only
@Composable
fun PreviewTheme(modifier: Modifier = Modifier,content: @Composable () -> Unit) {
    EmotionalIntelligenceTheme {
        Surface(
            modifier = modifier,
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}