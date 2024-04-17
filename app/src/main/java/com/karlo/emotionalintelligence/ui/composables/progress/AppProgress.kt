package com.karlo.emotionalintelligence.ui.composables.progress

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.CountColor

@Composable
fun AppProgress(progress: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        LinearProgressIndicator(
            modifier = Modifier.width(72.dp),
            progress = progress.toFloat() / 100,
            strokeCap = StrokeCap.Round,
        )
        Text(text = "${progress}%", color = CountColor, fontSize = 10.sp)
    }
}

@Preview
@Composable
private fun AppProgressPreview() {
    PreviewTheme {
        AppProgress(50)
    }

}