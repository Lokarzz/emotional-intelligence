package com.karlo.emotionalintelligence.ui.composables.level.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.Black1


@Composable
fun Level(level : Int) {
    Box(modifier = Modifier.size(100.dp)) {
        Image(
            modifier = Modifier.align(Alignment.TopCenter),
            painter = painterResource(id = R.drawable.ic_default_level_photo),
            contentDescription = null
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(color = Black1, shape = ShapeDefaults.Small),
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(vertical = 4.dp, horizontal = 16.dp),
                text = "${stringResource(id = R.string.level)} $level",
                style = MaterialTheme.typography.labelMedium,
                color = Color.White
            )
        }

    }
}
@Preview
@Composable
private fun LevelPreview() {
    PreviewTheme {
        Level(2)
    }
}