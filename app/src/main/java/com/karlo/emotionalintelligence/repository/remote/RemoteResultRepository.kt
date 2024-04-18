package com.karlo.emotionalintelligence.repository.remote

import com.karlo.emotionalintelligence.extensions.GsonExtension.fetchData
import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import com.karlo.emotionalintelligence.repository.remote.service.IAppService
import com.karlo.emotionalintelligence.util.assets.AssetJsonRetriever
import okhttp3.MediaType
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject


class RemoteResultRepository @Inject constructor(
    private val iAppService: IAppService,

    //
    private val assetJsonRetriever: AssetJsonRetriever
) {

    // for actual api call
//    suspend fun fetchResult(dayOfWeek: String) = iAppService.fetchResult(dayOfWeek)


    // for mock api call
    suspend fun fetchResult(dayOfWeek: String): Response<ResultResponse> {
        val assetResponse = assetJsonRetriever.loadJSONFromAssets("mon_levels.json")
        if (assetResponse == null) {
            val errorBody =
                ResponseBody.create(MediaType.get("application/json"), "{\"error\":\"Not Found\"}")
            return Response.error(200, errorBody)
        }
        return Response.success(assetResponse.fetchData(ResultResponse::class.java))
    }

}