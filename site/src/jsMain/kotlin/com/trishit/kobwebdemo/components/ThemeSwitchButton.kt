package com.trishit.kobwebdemo.components

import androidx.compose.runtime.Composable
import com.trishit.kobwebdemo.styles.ThemeIconStyle
import com.trishit.kobwebdemo.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px

@OptIn(DelicateApi::class)
@Composable
fun ThemeSwitchButton(
    colorMode: ColorMode,
    onClick: () -> Unit
) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(if (breakpoint > Breakpoint.SM) 24.px else 16.px)
            .position(Position.Fixed)
            .zIndex(1)
            .styleModifier {
                property("pointer-events", "none")
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {
        IconButton(
            icon = if(colorMode.isLight) Res.Icon.SUN else Res.Icon.MOON,
            modifier = ThemeIconStyle.toModifier()
                .styleModifier {
                    property("pointer-events", "auto")
                },
            colorMode = colorMode,
            iconSize = if (breakpoint > Breakpoint.SM) Res.Dimensions.ICON_SIZE_LG.px else Res.Dimensions.ICON_SIZE.px,
            onClick = onClick
        )
    }
}