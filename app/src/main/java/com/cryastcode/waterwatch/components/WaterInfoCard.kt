package com.cryastcode.waterwatch.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cryastcode.waterwatch.utils.AppColors

@Composable
fun WaterInfoCard(title: String, value: Int) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        color = AppColors.upBackground,
        shape = RoundedCornerShape(15.dp),
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                color = AppColors.texts,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "$value L",
                color = AppColors.texts,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}