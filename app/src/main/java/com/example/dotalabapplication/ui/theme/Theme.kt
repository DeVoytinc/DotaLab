package com.example.dotalabapplication.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

object AppTheme {

    object  Paddings {
        @get:Composable
        val AppNamePadding get() = appNamePadding

        @get:Composable
        val LeftPadding get() = contentPadding

        @get:Composable
        val LogoPadding get() = logoPadding
    }


    object  Rounds {
        @get:Composable
        val RoundMain get() = roundMain

        @get:Composable
        val RoundBg get() = roundBackground

        @get:Composable
        val MidleRoundedBox get() = midleRoundedBox
    }


    object Sizes {
        @get:Composable
        val BorderLogo get() = borderLogo

        @get:Composable
        val LogoSize get() = logoSize

        @get:Composable
        val MidleBoxSize get() = midleBoxSize

        @get:Composable
        val TopBoxSize get() = topBoxSize
    }

    object BgColors {
        @get:Composable
        val primary get() = primarybg

        @get:Composable
        val tag get() = tagbg

        @get:Composable
        val border get() = borderbg

        @get:Composable
        val divider get() = dividerbg
    }

    object ButtonColors {
        @get:Composable
        val main get() = mainButton
    }

    object TextColors {


        @get:Composable
        val primary get() = Color.White

        @get:Composable
        val secondary get() = secondaryText

        @get:Composable
        val tag get() = tagText

        @get:Composable
        val message get() = messageText

        @get:Composable
        val date get() = dateText

        @get:Composable
        val button get() = buttonText
    }

    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )

        val AppNameInStore
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None,
                    ),
                )
    }

}