package com.karlo.emotionalintelligence.model.level

import com.karlo.emotionalintelligence.model.level.activity.ActivityData
import kotlin.random.Random

data class LevelData(
    val level: String,
    val title: String,
    val description: String,
    val activities: List<ActivityData>
) {
    companion object {


        fun createMockLevel(level : String): LevelData {
            val activities = List(Random.nextInt(3, 5)) { ActivityData.createMockActivity() }
            return LevelData(
                level = level,
                title = "Level $level",
                description = "Description for Level $level",
                activities = activities
            )
        }
    }
}
