package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoImageEmoji
import org.kodein.emoji.food_drink.food_vegetable.Cucumber
import slides.components.MyStyleSheet


val whatIsGherkins by Slide(stepCount = 3) { step ->
    Text(
        text = styled(MyStyleSheet) { "${+em}What${-em} is Gherkin?" },
        style = MaterialTheme.typography.displayMedium
    )
    AnimatedVisibility(
        modifier = Modifier.padding(16.dp),
        visible = step >= 1
    ) {
        Text(styled(MyStyleSheet) { "A structured ${+em}language${-em} used to ${+em}describe${-em} the ${+em}behavior${-em} of the ${+em}system${-em} under test." })
    }
    AnimatedVisibility(
        modifier = Modifier.padding(8.dp),
        visible = step >= 2
    ) {
        TextWithNotoImageEmoji(
            style = MaterialTheme.typography.bodySmall,
            text = "Also a vegetable ${Emoji.Cucumber}"
        )
    }
}
