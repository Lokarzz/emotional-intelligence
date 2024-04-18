package com.karlo.emotionalintelligence.ui.composables.progress

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun AppLoader(show: Boolean, modifier: Modifier = Modifier) {
    if (!show) return
    CircularProgressIndicator(
        modifier = modifier.size(64.dp),
        color = MaterialTheme.colorScheme.secondary,
        trackColor = MaterialTheme.colorScheme.surfaceVariant,
    )
}