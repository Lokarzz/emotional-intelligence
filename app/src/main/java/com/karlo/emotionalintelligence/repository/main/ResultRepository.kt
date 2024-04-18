package com.karlo.emotionalintelligence.repository.main

import com.karlo.emotionalintelligence.extensions.ApiExtension.fetchResponse
import com.karlo.emotionalintelligence.repository.local.LocalResultRepository
import com.karlo.emotionalintelligence.repository.model.base.LoadingData
import com.karlo.emotionalintelligence.repository.model.base.UIState
import com.karlo.emotionalintelligence.repository.remote.RemoteResultRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class ResultRepository @Inject constructor(
    private val remoteResultRepository: RemoteResultRepository,
    private val localResultRepository: LocalResultRepository,
) {

    suspend fun fetchResult(dayOfWeek: String) = flow {
        val localResponse = localResultRepository.fetchResult(dayOfWeek = dayOfWeek)

        localResponse?.let {
            emit(UIState.success(it))
        }

        val remoteResponse =
            fetchResponse { remoteResultRepository.fetchResult(dayOfWeek = dayOfWeek) }

        if (remoteResponse.status == UIState.Status.SUCCESS) {
            emit(UIState.success(remoteResponse.data))
            localResultRepository.saveResult(
                key = dayOfWeek,
                resultResponse = remoteResponse.data!!
            )
            return@flow
        }
        emit(UIState.error(data = remoteResponse.error))
    }.onStart {
        emit(UIState.loading(LoadingData(true)))
    }.onCompletion {
        emit(UIState.loading(LoadingData(false)))
    }


}