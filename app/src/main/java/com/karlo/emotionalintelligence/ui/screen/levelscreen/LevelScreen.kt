package com.karlo.emotionalintelligence.ui.screen.levelscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.karlo.emotionalintelligence.model.level.Level
import com.karlo.emotionalintelligence.ui.composables.level.LevelItem
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme

@Composable
fun LevelScreen(levelViewModel: LevelViewModel = viewModel()) {
//    val levels by remember {
//        mutableStateOf<List<Level>?>(null)
//    }
    val levels by remember {
        mutableStateOf(List(2) { Level.createMockLevel(it + 1) })
    }
    val levelCpy = levels ?: return
    println(levelViewModel.test())
    LevelView(levels = levelCpy)
}

@Composable
fun LevelView(levels: List<Level>) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            items(levels) {
                LevelItem(level = it)
            }
        }
    }
}


@Preview
@Composable
private fun LevelScreenPreview() {
    PreviewTheme {
        val levels by remember {
            mutableStateOf(List(2) { Level.createMockLevel(it + 1) })
        }

        LevelView(levels = levels)
    }
}

