package slides

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.people_body.hands.Pray

val thanks by Slide {
    TextWithNotoAnimatedEmoji(
        text = "${Emoji.Pray} Thanks! ${Emoji.Pray}",
        style = MaterialTheme.typography.displayLarge,
        modifier = Modifier.padding(top = 16.dp)
    )
}
