package com.karlo.emotionalintelligence.ui.composables.iconlabel

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.theme.Purple1


@Composable
fun IconLabel(@DrawableRes drawableId: Int, text: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Image(painter = painterResource(id = drawableId), contentDescription = null)
        Text(text = text, color = Purple1, style = MaterialTheme.typography.labelMedium)
    }
}

@Preview
@Composable
private fun IconLabelPreview() {
    PreviewTheme {
        IconLabel(drawableId = R.drawable.ic_flag, stringResource(id = R.string.journey))
    }
}