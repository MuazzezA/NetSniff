package com.muazzeza.netsniff.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp



@Composable
fun ScanScreen() {
    var isScanning by remember { mutableStateOf(false) }
    var showResult by remember { mutableStateOf(false) }

    LaunchedEffect(isScanning) {
        if (isScanning) {
            showResult = false
            // gerçek tarama süresi eklenecek
            kotlinx.coroutines.delay(700*5)
            isScanning = false
            showResult = true
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = (LocalConfiguration.current.screenHeightDp.dp / 4))
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PulsingButton(
                isActive = isScanning,
                onClick = { isScanning = true }
            )

            Spacer(modifier = Modifier.height(20.dp))

            ResultContainer(visible = showResult)
        }
    }
}
