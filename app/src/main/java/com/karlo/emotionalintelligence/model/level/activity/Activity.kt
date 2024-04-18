package com.karlo.emotionalintelligence.model.level.activity

import kotlin.random.Random

data class Activity(
    val isDone: Boolean,
    val imageSrc: String,
    val title: String,
) {
    companion object {
        fun createMockActivity(): Activity {
            return Activity(
                isDone = Random.nextBoolean(),
                imageSrc = "",
                title = "Activity ${Random.nextInt(1, 100)}"
            )
        }
    }
}
