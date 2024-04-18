package com.karlo.emotionalintelligence.ui.screen.levelscreen

import androidx.lifecycle.ViewModel
import com.karlo.emotionalintelligence.repository.main.ResultRepository
import com.karlo.emotionalintelligence.repository.model.base.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LevelViewModel @Inject constructor(
    private val resultRepository: ResultRepository
) : ViewModel() {


    suspend fun fetchResults() {
        resultRepository.fetchResult("mon").collect { state ->
            when (state.status) {
                UIState.Status.SUCCESS -> {
                    val response = state.data
                }

                UIState.Status.ERROR -> {

                }

                else -> {
                }
            }
        }
    }
}