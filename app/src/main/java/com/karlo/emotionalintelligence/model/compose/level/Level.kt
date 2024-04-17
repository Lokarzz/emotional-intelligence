package com.karlo.emotionalintelligence.model.compose.level

import com.karlo.emotionalintelligence.model.compose.level.activity.Activity
import kotlin.random.Random

data class Level(
    val level: Int,
    val title: String,
    val description: String,
    val activities: List<Activity>
) {
    companion object {


        fun createMockLevel(level : Int): Level {
            val activities = List(Random.nextInt(3, 5)) { Activity.createMockActivity() }
            return Level(
                level = level,
                title = "Level $level",
                description = "Description for Level $level",
                activities = activities
            )
        }
    }
}
