package com.karlo.emotionalintelligence.repository.remote

import com.karlo.emotionalintelligence.repository.remote.service.IAppService
import javax.inject.Inject

class RemoteResultRepository @Inject constructor(
    private val iAppService: IAppService
) {

    suspend fun fetchResult(weekOfDay: String) = iAppService.fetchResult(weekOfDay = weekOfDay)

}