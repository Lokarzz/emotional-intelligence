package com.karlo.emotionalintelligence.ui.composables.statuscount

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.CountColor

@Composable
fun StatusCount(@DrawableRes drawableId: Int, count: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = drawableId),
            contentDescription = null
        )
        Text(text = "$count", style = MaterialTheme.typography.titleMedium, color = CountColor)
    }
}

@Preview
@Composable
private fun StatusCountPreview() {
    PreviewTheme {
        StatusCount(drawableId = R.drawable.ic_fire, count = 2)
    }
}