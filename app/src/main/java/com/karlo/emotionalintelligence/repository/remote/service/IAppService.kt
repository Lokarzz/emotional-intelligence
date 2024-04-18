package com.karlo.emotionalintelligence.repository.remote.service

import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface IAppService {

    @GET("/results/{dayOfWeek}")
    suspend fun fetchResult(@Path("dayOfWeek") dayOfWeek: String) : Response<ResultResponse>

}