package com.karlo.emotionalintelligence.ui.composables.profileheader.tamingtemper

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.composables.progress.AppProgress
import com.karlo.emotionalintelligence.ui.theme.Purple2

@Composable
fun TamingTemper(progress: Int) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(40.dp),
            shape = ShapeDefaults.Medium,
            colors = CardDefaults.cardColors(containerColor = Purple2)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_taming_temper),
                    contentDescription = null
                )
            }
        }

        Column {
            Text(
                text = stringResource(id = R.string.taming_temper),
                style = MaterialTheme.typography.titleMedium
            )
            AppProgress(progress = progress)
        }
    }
}

@Preview
@Composable
private fun TamingTemperPreview() {
    PreviewTheme {
        TamingTemper(progress = 35)
    }

}

