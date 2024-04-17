package com.karlo.emotionalintelligence.ui.screen.mainscreen.tabs

import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.screen.mainscreen.tabs.tab.DayTab
import com.karlo.emotionalintelligence.util.weeks.WeeksInformation

@Composable
fun WeekTabRow(onTabSelect: (Int) -> Unit, tabs: List<String>) {
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }



    TabRow(selectedTabIndex = selectedTabIndex) {
        tabs.forEachIndexed { index, dayOfWeek ->
            DayTab(
                selected = selectedTabIndex == index,
                onClick = {
                    selectedTabIndex = index
                    onTabSelect(index)
                },
                dayOfWeek = dayOfWeek.uppercase()
            )
        }
    }
}

@Preview
@Composable
private fun WeekTabRowPreview() {
    PreviewTheme {
        val tabs by remember {
            mutableStateOf(WeeksInformation().daysOfTheWeek())
        }
        WeekTabRow(onTabSelect = {}, tabs = tabs)
    }
}