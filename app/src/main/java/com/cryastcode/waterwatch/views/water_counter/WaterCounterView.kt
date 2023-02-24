package com.cryastcode.waterwatch.views.water_counter

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cryastcode.waterwatch.components.WaterInfoCard

@Preview
@Composable
fun WaterCounterView() {
    Surface(
        modifier = Modifier
            .fillMaxSize(), color = MaterialTheme.colors.primary
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                WaterTimerBox()
                Spacer(modifier = Modifier.height(40.dp))
                WaterInfoCard(title = "Water used:", value = 100)
            }
            Button(
                modifier = Modifier.fillMaxWidth(0.4f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0xFF99E73F),
                ),
                onClick = {
                    //TODO: Implement timer start and stop
                }) {
                Text(text = "Start")
            }
        }
    }
}