package com.muazzeza.netsniff.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ResultContainer(
    visible: Boolean,
    modifier: Modifier = Modifier
) {
    if (visible) {
        Text(
            text = "Done!",
            modifier = modifier
        )
    }
}
