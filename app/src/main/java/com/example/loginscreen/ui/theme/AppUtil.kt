package com.example.loginscreen.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun AppUtil(
    appDimens: Dimens,
    content: @Composable () -> Unit
) {
    val appDimen = remember {
        appDimens
    }
    CompositionLocalProvider(LocalAppDimens provides appDimen) {
        content()
    }
}

val LocalAppDimens = compositionLocalOf {
    CompactDimens
}