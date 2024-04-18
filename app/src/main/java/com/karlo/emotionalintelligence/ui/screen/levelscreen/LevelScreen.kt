package com.karlo.emotionalintelligence.ui.screen.levelscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.karlo.emotionalintelligence.model.level.LevelData
import com.karlo.emotionalintelligence.ui.composables.level.LevelItem
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.composables.progress.AppLoader

@Composable
fun LevelScreen(levelViewModel: LevelViewModel = hiltViewModel(), dayOfTheWeek: String) {
    LaunchedEffect(key1 = Unit) {
        levelViewModel.fetchResults(dayOfTheWeek)
    }
    val uiState by levelViewModel.uiState.collectAsState()

    LevelView(uiState)
}

@Composable
fun LevelView(uiState: Level.UiState) {
    val levelDataList = uiState.levelDataList
    Box(modifier = Modifier.fillMaxSize()) {
        AppLoader(modifier = Modifier.align(Alignment.TopCenter), show = uiState.isLoading)
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 16.dp),
        ) {
            if (levelDataList != null) {
                items(levelDataList) {
                    LevelItem(level = it)
                }
            }
        }
    }
}


@Preview
@Composable
private fun LevelScreenPreview() {
    PreviewTheme {
        val levels by remember {
            mutableStateOf(List(2) { LevelData.createMockLevel((it + 1).toString()) })
        }

        LevelView(uiState = Level.UiState(levelDataList = levels, isLoading = false))
    }
}

