package com.cryastcode.waterwatch.views.water_counter

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun WaterTimerBox() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .border(
                width = 2.dp,
                color = MaterialTheme.colors.primaryVariant,
                shape = MaterialTheme.shapes.large
            )
            .clip(shape = MaterialTheme.shapes.large),
        shape = MaterialTheme.shapes.large,
        color = Color.Transparent
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .wrapContentHeight(),
            text = "20:01",
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center
        )
    }
}