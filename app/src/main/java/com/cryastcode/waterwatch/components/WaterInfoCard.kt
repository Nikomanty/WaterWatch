package com.cryastcode.waterwatch.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun WaterInfoCard(title: String = "asd", value: Int = 12) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        color = MaterialTheme.colors.primaryVariant,
        shape = MaterialTheme.shapes.large,
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h3
            )
            Text(
                text = "$value L",
                style = MaterialTheme.typography.h3
            )
        }
    }
}