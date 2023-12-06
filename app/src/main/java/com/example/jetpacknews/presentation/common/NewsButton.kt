package com.example.jetpacknews.presentation.common

import android.provider.CalendarContract
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacknews.R
import com.example.jetpacknews.ui.theme.WhiteGray


@Composable
fun NewsButton(
    text: String,
    onClick: () -> Unit
) {
   Button(onClick = onClick,
             colors = ButtonDefaults.buttonColors(
           containerColor = MaterialTheme.colorScheme.primary,
           contentColor = Color.White
       ),
        shape = RoundedCornerShape(8.dp),
       ) {
       Text(text = text,
           style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
           )
   }
}

@Composable
fun NewsTextButton(
    text: String,
    onClick: () -> Unit
){
  TextButton(onClick = onClick) {
      Text(text = text,
          style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
          color = WhiteGray
      )
  }
}

@Preview
@Composable
fun NewsButtonPreview() {
    NewsButton(text = "Button", onClick = {})
}