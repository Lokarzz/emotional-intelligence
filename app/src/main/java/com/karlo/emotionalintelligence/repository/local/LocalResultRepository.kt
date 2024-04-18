package com.karlo.emotionalintelligence.repository.local

import javax.inject.Inject

class LocalResultRepository @Inject constructor(
    private val localDataStoreRepository: LocalDataStoreRepository
) {


    suspend fun fetchResult(weekOfTheDay: String) {
        localDataStoreRepository.fetch(weekOfTheDay)
    }

}