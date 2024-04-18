package com.karlo.emotionalintelligence.ui.composables.level.activity

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.Purple1

@Composable
fun ActivityImage(isDone: Boolean, imgSrc: String) {
    Box(modifier = Modifier.size(144.dp, 132.dp)) {

        Image(
            modifier = Modifier
                .fillMaxSize(),
            // TODO implement Glide
            painter = painterResource(id = R.drawable.img_preview_activity),
            contentDescription = null,
        )
        AnimatedVisibility(modifier = Modifier.align(Alignment.TopEnd), visible = isDone) {
            Box(
                modifier = Modifier
                    .padding(4.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .background(color = Purple1, shape = CircleShape)
                        .border(2.dp, Color.White, CircleShape)
                ) {
                    Icon(
                        modifier = Modifier
                            .align(Alignment.Center),
                        painter = painterResource(id = R.drawable.ic_check),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ActivityImagePreview() {
    PreviewTheme {
        ActivityImage(isDone = true, imgSrc = "")
    }
}