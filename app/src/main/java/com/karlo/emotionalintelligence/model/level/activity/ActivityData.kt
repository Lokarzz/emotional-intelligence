package com.karlo.emotionalintelligence.model.level.activity

import kotlin.random.Random

data class ActivityData(
    val title: String,
    val isDone: Boolean,
    val imageSrc: String,
) {
    companion object {
        fun createMockActivity(): ActivityData {
            return ActivityData(
                isDone = Random.nextBoolean(),
                imageSrc = "",
                title = "Activity ${Random.nextInt(1, 100)}"
            )
        }
    }
}
