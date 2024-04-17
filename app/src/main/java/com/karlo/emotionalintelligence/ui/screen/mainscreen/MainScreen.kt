package com.karlo.emotionalintelligence.ui.screen.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.composables.profileheader.ProfileHeader
import com.karlo.emotionalintelligence.ui.screen.mainscreen.footer.Footer
import com.karlo.emotionalintelligence.ui.screen.mainscreen.mainnavigation.MainNavigation
import com.karlo.emotionalintelligence.ui.screen.mainscreen.tabs.WeekTabRow
import com.karlo.emotionalintelligence.util.weeks.WeeksInformation

@Composable
fun MainScreen() {
    var tabIndex by remember {
        mutableIntStateOf(0)
    }
    val daysOfTheWeek by remember {
        mutableStateOf(WeeksInformation().daysOfTheWeek())
    }

    Column {
        ProfileHeader()
        WeekTabRow(
            onTabSelect = {
                tabIndex = it
            },
            tabs = daysOfTheWeek,
            currentIndex = tabIndex
        )
        MainNavigation(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            daysOfTheWeek = daysOfTheWeek,
            currentIndex = tabIndex,
            onPageChange = { tabIndex = it }
        )
        Divider()
        Footer()
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    PreviewTheme(modifier = Modifier.fillMaxSize()) {
        MainScreen()
    }
}