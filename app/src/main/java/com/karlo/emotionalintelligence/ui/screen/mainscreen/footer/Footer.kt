package com.karlo.emotionalintelligence.ui.screen.mainscreen.footer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.iconlabel.IconLabel
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme

@Composable
fun Footer() {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp), contentAlignment = Alignment.Center) {
        IconLabel(
            drawableId = R.drawable.ic_flag,
            text = stringResource(id = R.string.journey)
        )
    }
}

@Preview
@Composable
private fun FooterPreview() {
    PreviewTheme(modifier = Modifier.fillMaxWidth()) {
        Footer()
    }
}