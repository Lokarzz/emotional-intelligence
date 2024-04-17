package com.karlo.emotionalintelligence.ui.composables.level.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme


@Composable
fun Details(level: Int, title: String, description: String) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Level(level = level)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = title, style = MaterialTheme.typography.titleLarge.copy(fontSize = 18.sp))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = description, style = MaterialTheme.typography.bodySmall)
    }
}

@Preview
@Composable
private fun DetailsPreview() {
    PreviewTheme {
        Details(level = 2, title = "Sample title", description = "Sample description")
    }
}