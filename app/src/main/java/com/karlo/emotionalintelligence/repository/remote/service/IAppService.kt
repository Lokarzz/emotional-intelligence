package com.karlo.emotionalintelligence.repository.remote.service

import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface IAppService {

    @GET("/results/{weekOfDay}")
    suspend fun fetchResult(@Path("weekOfDay") weekOfDay: String) : Response<ResultResponse>

}