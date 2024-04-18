package com.karlo.emotionalintelligence.util.level

import com.karlo.emotionalintelligence.model.level.LevelData
import com.karlo.emotionalintelligence.model.level.activity.ActivityData
import com.karlo.emotionalintelligence.repository.model.result.Activities
import com.karlo.emotionalintelligence.repository.model.result.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LevelTransformer(private val resultResponse: ResultResponse) {


    suspend fun mapToLevelData(): List<LevelData> {
        return withContext(Dispatchers.Default) {

            resultResponse.levels.map {
                LevelData(
                    level = it.level ?: "",
                    title = it.title ?: "",
                    description = it.description ?: "",
                    activities = mapActivities(it.activities)
                )
            }
        }

    }

    private fun mapActivities(activities: List<Activities>): List<ActivityData> {

        return activities.map {
            ActivityData(
                title = it.title ?: "",
                isDone = true,
                imageSrc = ""
            )
        }
    }
}