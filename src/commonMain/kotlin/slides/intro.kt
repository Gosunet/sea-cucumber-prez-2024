package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithPlatformEmoji
import org.kodein.emoji.travel_places.sky_weather.WaterWave
import sea_cucumber_prez_2024.generated.resources.Res
import sea_cucumber_prez_2024.generated.resources.zenika


@OptIn(ExperimentalResourceApi::class)
val intro by Slide(stepCount = 2) { step ->
    Image(
        painterResource(Res.drawable.zenika),
        contentDescription = "Zenika",
        modifier = Modifier
            .size(180.dp)
    )
    TextWithPlatformEmoji(
        text = "(Sea ${Emoji.WaterWave}) Cucumber in 2024",
        style = MaterialTheme.typography.displayLarge
    )

    AnimatedVisibility(
        visible = step >= 1,
    ) {
        TextWithPlatformEmoji(
            text = "Is this still relevant today?",
            style = MaterialTheme.typography.displayMedium
        )
    }
}
