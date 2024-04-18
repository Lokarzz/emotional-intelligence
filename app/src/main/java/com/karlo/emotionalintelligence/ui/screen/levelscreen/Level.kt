package com.karlo.emotionalintelligence.ui.screen.levelscreen

import com.karlo.emotionalintelligence.model.level.LevelData

object Level {

    data class UiState(
        val levelDataList: List<LevelData>? = null,
        val isLoading: Boolean = false,
    )

}