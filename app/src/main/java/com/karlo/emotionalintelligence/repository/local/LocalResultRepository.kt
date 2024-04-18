package com.karlo.emotionalintelligence.repository.local

import com.karlo.emotionalintelligence.extensions.GsonExtension.fetchData
import com.karlo.emotionalintelligence.extensions.GsonExtension.toJsonString
import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocalResultRepository @Inject constructor(
    private val localDataStoreRepository: LocalDataStoreRepository
) {

    suspend fun fetchResult(dayOfWeek: String): ResultResponse? {
        return withContext(Dispatchers.IO) {
            val storedValue = localDataStoreRepository.fetch(dayOfWeek)
            storedValue.first().fetchData(ResultResponse::class.java)
        }
    }

    suspend fun saveResult(key: String, resultResponse: ResultResponse) {
        localDataStoreRepository.saveDataStore(key, resultResponse.toJsonString())
    }

}