package com.trishit.kobwebdemo.components

import androidx.compose.runtime.Composable
import com.trishit.kobwebdemo.styles.ButtonStyle
import com.trishit.kobwebdemo.styles.SocialIconStyle
import com.trishit.kobwebdemo.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftPane(
    colorMode: ColorMode,
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(50.px),
        horizontalAlignment = if (breakpoint <= Breakpoint.MD) Alignment.CenterHorizontally else Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .fontWeight(FontWeight.Bold)
                .fontSize(50.px)
                .color(if(colorMode.isLight) Colors.Black else Colors.White)
                .textAlign(
                    if (breakpoint <= Breakpoint.MD) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.TITLE,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontSize(18.px)
                .fontFamily(Res.String.ROBOTO_REG)
                .color(if(colorMode.isLight) Colors.Black else Colors.White)
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .width(50.px)
                .margin(bottom = 24.px)
                .background(if(colorMode.isLight) Res.Theme.BLUE.color else Res.Theme.DARK_BLUE.color)
                .align(
                    if (breakpoint <= Breakpoint.MD) Alignment.CenterHorizontally
                    else Alignment.Start
                ),
        ) {}
        SpanText(
            text = Res.String.DESC,
            modifier = Modifier
                .margin(bottom = 36.px)
                .fontSize(14.px)
                .opacity(60.percent)
                .lineHeight(2)
                .fontFamily(Res.String.ROBOTO_REG)
                .color(if(colorMode.isLight) Colors.Black else Colors.White)
                .textAlign(
                    if (breakpoint <= Breakpoint.MD) TextAlign.Center
                    else TextAlign.Start
                )
        )
        Button(
            modifier = ButtonStyle.toModifier()
                .margin(bottom = 50.px)
                .borderRadius(16.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.EMAIL_TO }
        ) {
            Image(
                modifier = Modifier.margin(right = 10.px),
                src = if(colorMode.isLight) Res.Icon.EMAIL else Res.Icon.EMAIL_LIGHT
            )
            SpanText(
                text = Res.String.BUTTON_TEXT,
                modifier = Modifier
                    .color(if(colorMode.isLight) Colors.White else Res.Theme.GRADIENT_ONE_DARK.color)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.String.ROBOTO_REG)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.MD)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.filter {
                if(colorMode.isLight) !it.name.contains("Light")
                else it.name.contains("Light")
            }.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    link = it.link,
                    icon = it.icon
                )
            }
        }
    }
}