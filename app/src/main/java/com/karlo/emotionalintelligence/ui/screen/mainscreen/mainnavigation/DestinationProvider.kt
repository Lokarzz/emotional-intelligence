package com.karlo.emotionalintelligence.ui.screen.mainscreen.mainnavigation

class DestinationProvider(private val daysOfTheWeek: List<String>) {


    fun startDestination(): String {
        return "$BASE_ROUTE/${daysOfTheWeek[0].lowercase()}"
    }

    fun fetchDestination(index: Int): String {
        return "$BASE_ROUTE/${daysOfTheWeek[index].lowercase()}"
    }

    companion object {
        private const val BASE_ROUTE = "days"
    }

}