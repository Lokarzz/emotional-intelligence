package com.karlo.emotionalintelligence.ui.screen.mainscreen.tabs.tab

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.GRAY1
import com.karlo.emotionalintelligence.ui.theme.Purple1

@Composable
fun DayTab(selected: Boolean, onClick: () -> Unit, dayOfWeek: String) {
    val iconDrawable = if (selected) R.drawable.ic_selected_tab else R.drawable.ic_unselected_tab

    Tab(
        selected = selected,
        onClick = onClick,
        text = {
            Text(
                text = dayOfWeek,
                style = MaterialTheme.typography.labelMedium,
                maxLines = 1,
                textAlign = TextAlign.Center
            )
        },
        selectedContentColor = Purple1,
        unselectedContentColor = GRAY1,
        icon = {
            Image(
                painter = painterResource(id = iconDrawable),
                contentDescription = null
            )
        }
    )
}


@Preview
@Composable
private fun DayTabSelectedPreview() {
    PreviewTheme {
        DayTab(selected = true, onClick = { }, dayOfWeek = "Mon")
    }
}

@Preview
@Composable
private fun DayTabUnSelectedPreview() {
    PreviewTheme {
        DayTab(selected = false, onClick = { }, dayOfWeek = "Tue")
    }
}