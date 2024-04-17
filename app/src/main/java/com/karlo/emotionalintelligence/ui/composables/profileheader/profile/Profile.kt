package com.karlo.emotionalintelligence.ui.composables.profileheader.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karlo.emotionalintelligence.R
import com.karlo.emotionalintelligence.ui.composables.preview.PreviewTheme
import com.karlo.emotionalintelligence.ui.composables.statuscount.StatusCount

@Composable
fun Profile() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        StatusCount(drawableId = R.drawable.ic_fire, count = 10)
        Card(
            modifier = Modifier.size(40.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_default_profile_photo),
                    contentDescription = null
                )
            }
        }
    }
}

@Preview
@Composable
private fun ProfilePreview() {
    PreviewTheme {
        Profile()
    }
}