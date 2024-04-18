package com.karlo.emotionalintelligence.ui.screen.mainscreen.mainnavigation

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.karlo.emotionalintelligence.ui.screen.levelscreen.LevelScreen

@Composable
fun MainNavigation(
    modifier: Modifier,
    currentIndex: Int,
    onPageChange: (Int) -> Unit,
    daysOfTheWeek: List<String>
) {

    val pagerState = rememberPagerState {
        daysOfTheWeek.size
    }
    LaunchedEffect(key1 = currentIndex) {
        pagerState.animateScrollToPage(currentIndex)
    }
    LaunchedEffect(key1 = pagerState.currentPage) {
        onPageChange(pagerState.currentPage)
    }
    HorizontalPager(modifier = modifier, state = pagerState) {
        LevelScreen(dayOfTheWeek = daysOfTheWeek[it])
    }
}