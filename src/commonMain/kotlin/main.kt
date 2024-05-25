import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import net.kodein.cup.Presentation
import net.kodein.cup.Slides
import net.kodein.cup.cupApplication
import net.kodein.cup.laser.laser
import net.kodein.cup.speaker.speakerWindow
import net.kodein.cup.widgets.material3.cupScaleDown
import org.kodein.emoji.compose.EmojiService
import slides.conclusion
import slides.gherkinSample
import slides.gherkinSample1Steps
import slides.gherkinSample2
import slides.gherkinSample3
import slides.gherkinSample3b
import slides.gherkinSample3c
import slides.howToImpl
import slides.intro
import slides.modernStack
import slides.notGherkins
import slides.runIt
import slides.stillRelevant
import slides.thanks
import slides.whatIsCucumber
import slides.whatIsCucumber2
import slides.whatIsGherkins
import slides.whenUse
import slides.whyUse
import slides.whyUse2


fun main() = cupApplication(
    title = "(Sea 🌊) Cucumber in 2024"
) {
    remember {
        EmojiService.initialize()
    }

    MaterialTheme(
        colorScheme = darkColorScheme().copy(
            tertiary = Color(238, 34, 56)
        ),
        typography = MaterialTheme.typography.cupScaleDown()
    ) {
        Presentation(
            slides = presentationSlides,
            configuration = {
                speakerWindow()
                laser()
            },
            backgroundColor = MaterialTheme.colorScheme.background
        ) { slidesContent ->
            CompositionLocalProvider(
                LocalContentColor provides MaterialTheme.colorScheme.onBackground
            ) {
                slidesContent()
            }
        }
    }
}


val presentationSlides = Slides(
    intro,
    whatIsCucumber,
    whatIsCucumber2,
    notGherkins,
    whatIsGherkins,
    gherkinSample,
    gherkinSample1Steps,
    gherkinSample2,
    gherkinSample3,
    gherkinSample3b,
    gherkinSample3c,
    whyUse,
    whyUse2,
    whenUse,
    stillRelevant,
    modernStack,
    howToImpl,
    runIt,
    conclusion,
    thanks,
)
