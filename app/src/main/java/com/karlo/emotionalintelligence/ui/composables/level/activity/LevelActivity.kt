package com.karlo.emotionalintelligence.ui.composables.level.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.model.level.activity.Activity
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme

@Composable
fun LevelActivity(modifier: Modifier = Modifier, activity: Activity) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ActivityImage(isDone = activity.isDone, imgSrc = activity.imageSrc)
        Text(text = activity.title, style = MaterialTheme.typography.titleSmall)
    }
}

@Preview
@Composable
private fun LevelActivityPreview() {
    PreviewTheme {
        LevelActivity(activity = Activity.createMockActivity())
    }
}