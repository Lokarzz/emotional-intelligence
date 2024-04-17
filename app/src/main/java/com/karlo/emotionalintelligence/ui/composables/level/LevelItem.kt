package com.karlo.emotionalintelligence.ui.composables.level

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.model.compose.level.Level
import com.karlo.emotionalintelligence.ui.composables.level.activity.LevelActivity
import com.karlo.emotionalintelligence.ui.composables.level.details.Details
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun LevelItem(level: Level) {

    Column {
        Details(level = level.level, title = level.title, description = level.description)
        FlowRow(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            maxItemsInEachRow = 2,
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            level.activities.forEach {
                LevelActivity(modifier = Modifier.padding(horizontal = 16.dp), activity = it)
            }
        }
    }
}

@Preview
@Composable
private fun LevelItemPreview() {
    PreviewTheme {
        LevelItem(level = Level.createMockLevel(1))
    }
}

