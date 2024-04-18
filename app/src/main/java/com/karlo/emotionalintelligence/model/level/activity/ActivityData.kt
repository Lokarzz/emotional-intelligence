package com.karlo.emotionalintelligence.model.level.activity

import kotlin.random.Random

data class ActivityData(
    val title: String,
    val isDone: Boolean,
    val imageSrc: String,
) {
    companion object {

        // only NOT_SET given on json file
        // TODO add remaining states
        const val STATE_NOT_SET = "NOT_SET"

        fun createMockActivity(): ActivityData {
            return ActivityData(
                isDone = Random.nextBoolean(),
                imageSrc = "",
                title = "Activity ${Random.nextInt(1, 100)}"
            )
        }
    }
}
