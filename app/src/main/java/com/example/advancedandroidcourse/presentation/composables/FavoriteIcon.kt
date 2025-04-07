package com.example.advancedandroidcourse.presentation.composables

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.advancedandroidcourse.R


@Composable
fun FavoriteIcon(
    modifier: Modifier = Modifier,
    isSaved: Boolean,
    onToggleSaved: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = modifier
            .size(24.dp)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onToggleSaved
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
                painter = painterResource(id = if (isSaved) R.drawable.favorite_filled else R.drawable.favorite),
                contentDescription = "Save",
                tint = Color.Red
        )
    }
}