package com.cryastcode.waterwatch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cryastcode.waterwatch.ui.theme.WaterWatchTheme
import com.cryastcode.waterwatch.views.WaterTrackerHome
import com.cryastcode.waterwatch.views.water_counter.WaterCounterView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterWatchTheme {
                WaterTrackerHome()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WaterWatchTheme {
        WaterTrackerHome()
    }
}