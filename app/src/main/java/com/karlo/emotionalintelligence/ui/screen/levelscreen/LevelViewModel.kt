package com.karlo.emotionalintelligence.ui.screen.levelscreen

import androidx.lifecycle.ViewModel
import com.karlo.emotionalintelligence.repository.main.ResultRepository
import com.karlo.emotionalintelligence.repository.model.base.UIState
import com.karlo.emotionalintelligence.util.level.LevelTransformer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class LevelViewModel @Inject constructor(
    private val resultRepository: ResultRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(Level.UiState())
    val uiState: StateFlow<Level.UiState> = _uiState.asStateFlow()

    suspend fun fetchResults(dayOfTheWeek: String) {
        resultRepository.fetchResult(dayOfTheWeek)
            .flowOn(Dispatchers.Default)
            .collect { state ->
                when (state.status) {
                    UIState.Status.SUCCESS -> {
                        // success response should not be null
                        val response = state.data!!
                        val levelTransformer = LevelTransformer(response)
                        _uiState.update {
                            it.copy(
                                levelDataList = levelTransformer.mapToLevelData(),
                                isLoading = false,
                            )
                        }
                    }

                    UIState.Status.ERROR -> {

                    }

                    UIState.Status.LOADING -> {
                        val isLoading = state.loadingData?.isLoading ?: return@collect
                        _uiState.update {
                            it.copy(
                                isLoading = isLoading
                            )
                        }
                    }

                    else -> {
                    }
                }
            }
    }
}