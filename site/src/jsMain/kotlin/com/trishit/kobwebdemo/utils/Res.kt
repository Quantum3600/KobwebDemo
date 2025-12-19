package com.trishit.kobwebdemo.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }
    object Icon {
        const val EMAIL = "mail.svg"
        const val EMAIL_LIGHT = "mail_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }
    object Image {
        const val PROFILE_PIC = "photo.webp"
    }
    object String {
        const val NAME = "Trishit Majumdar"
        const val TITLE = "Aspiring Android & Kotlin Multiplatform Developer"
        const val DESC = "I am a student pursuing Computer Science and Engineering. I'm eager to learn about the capabilities of Kotlin in different fields as it is my favourite language. This website is entirely made on Kobweb framework based on Compose HTML and Kotlin/JS."
        const val BUTTON_TEXT = "Contact Me"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REG = "RobotoRegular"
        const val SAVED_THEME = "theme"
        const val EMAIL_TO = "mailto:trishitquantum360@gmail.com"
    }
    object Dimensions {
        const val MAX_WIDTH = 1000
        const val MAX_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
        const val BORDER_RADIUS = 32
    }
}