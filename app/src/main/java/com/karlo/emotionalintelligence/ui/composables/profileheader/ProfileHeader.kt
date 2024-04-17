package com.karlo.emotionalintelligence.ui.composables.profileheader

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.composables.profileheader.profile.Profile
import com.karlo.emotionalintelligence.ui.composables.profileheader.tamingtemper.TamingTemper

@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TamingTemper(progress = 50)
        Profile()
    }
}


@Preview
@Composable
private fun ProfileHeaderPreview() {
    PreviewTheme {
        ProfileHeader()
    }
}