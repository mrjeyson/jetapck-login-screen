package com.example.loginscreen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    Surface {
        Column {
            val uiColor = if (isSystemInDarkTheme()) Color.White else Color.Black

            Box(contentAlignment = Alignment.TopCenter) {
                Image(
                    painter = painterResource(id = R.drawable.shape),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.46f),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )


                Row(
                    modifier = Modifier.padding(top = 80.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        modifier = Modifier.size(42.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = stringResource(
                            id = R.string.app_logo
                        ),
                        tint = uiColor
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.the_tolet),
                            style = MaterialTheme.typography.headlineMedium,
                            color = uiColor
                        )

                        Text(
                            text = stringResource(id = R.string.find_house),
                            style = MaterialTheme.typography.titleMedium,
                            color = uiColor
                        )
                    }


                }
            }
        }

    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
