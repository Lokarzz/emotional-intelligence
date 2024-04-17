package com.karlo.emotionalintelligence.util.weeks

class WeeksInformation {

    enum class DayOfTheWeek(val abbreviation: String) {
        MON("Mon"), TUE("Tue"), WED("Wed"), THU("Thu"), FRI("Fri"), SAT("Sat"), SUN("Sun")
    }

    fun daysOfTheWeek(): List<String> {
        return DayOfTheWeek.entries.map { it.abbreviation }
    }

}