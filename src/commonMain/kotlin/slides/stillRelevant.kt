package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithPlatformEmoji
import org.kodein.emoji.food_drink.food_vegetable.Cucumber
import slides.components.BulletPoints
import slides.components.MyStyleSheet
import slides.components.MyStyleSheet.unaryMinus
import slides.components.MyStyleSheet.unaryPlus

val stillRelevant by Slide(stepCount = 2) { step ->
    Text(
        text = styled(MyStyleSheet) { "Is this still relevant?" },
        style = MaterialTheme.typography.displayMedium
    )
    AnimatedVisibility(
        visible = step >= 1
    ) {
        Text(
            "YES",
            modifier = Modifier.padding(top = 8.dp),
            style = MaterialTheme.typography.displayMedium
        )
    }
}
