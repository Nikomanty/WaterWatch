package com.cryastcode.waterwatch.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.cryastcode.waterwatch.views.water_counter.WaterCounterView

@Composable
fun WaterTrackerHome() {
    Scaffold(
        bottomBar = {
            BottomNavigation(
                Modifier
                    .fillMaxWidth()
                    .height(70.dp),
                backgroundColor = MaterialTheme.colors.secondary,
                elevation = 5.dp,
            ) {
                //TODO: Implement Navigation items in bottom nav bar
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            WaterCounterView()
        }
    }
}
