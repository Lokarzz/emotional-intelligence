package com.karlo.emotionalintelligence.util.level

import com.karlo.emotionalintelligence.model.level.LevelData
import com.karlo.emotionalintelligence.model.level.activity.ActivityData
import com.karlo.emotionalintelligence.repository.model.result.Activities
import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.random.Random

class LevelTransformer(private val resultResponse: ResultResponse) {


    suspend fun mapToLevelData(): List<LevelData> {
        return withContext(Dispatchers.Default) {

            resultResponse.levels.map {
                LevelData(
                    level = it.level ?: "",
                    title = it.title ?: "",
                    description = it.description ?: "",
                    activities = it.activities.mapActivities(),
                    isAvailable = it.state == LevelData.STATE_AVAILABLE
                )
            }
        }
    }

    private fun List<Activities>.mapActivities(): List<ActivityData> {

        return map {
//
//            val isDone = it.state != ActivityData.STATE_NOT_SET
            val isDone =
                Random.nextBoolean() // just for mock since state has only one value in json

            ActivityData(
                title = it.title ?: "",
                isDone = isDone,
                imageSrc = it.fetchImgSrc(isDone = isDone)
            )
        }
    }

    private fun Activities.fetchImgSrc(isDone: Boolean): String {
        val targetIcon = if (isDone) icon else lockedIcon
        return targetIcon?.file?.url ?: ""
    }

    companion object {

    }
}