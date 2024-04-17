package com.karlo.emotionalintelligence.ui.screen.mainscreen.mainnavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.karlo.emotionalintelligence.ui.screen.levelscreen.LevelScreen

@Composable
fun MainNavigation(
    modifier: Modifier,
    daysOfTheWeek: List<String>,
    navController: NavHostController,
    destinationProvider: DestinationProvider
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = destinationProvider.startDestination()
    ) {
        composable(
            route = "days/{dayOfTheWeek}",
            arguments = listOf(navArgument("dayOfTheWeek") { type = NavType.StringType })
        ) {
            LevelScreen(dayOfTheWeek = it.arguments?.getString("dayOfTheWeek"))
        }
    }
}