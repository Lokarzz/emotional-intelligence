package com.karlo.emotionalintelligence.repository.main

import com.karlo.emotionalintelligence.repository.local.LocalDataStoreRepository
import com.karlo.emotionalintelligence.repository.local.LocalResultRepository
import com.karlo.emotionalintelligence.repository.remote.RemoteResultRepository
import javax.inject.Inject

class ResultRepository @Inject constructor(
    private val remoteResultRepository: RemoteResultRepository,
    private val localResultRepository: LocalResultRepository,
) {
    suspend fun fetchResult() {
    }


}