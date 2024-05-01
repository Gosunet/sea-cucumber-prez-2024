package slides

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

val whyUse by Slide(stepCount = 4) { step ->
    Text(
        text = styled(MyStyleSheet) { "${+em}Why${-em} use Cucumber (and gherkin)?" },
        style = MaterialTheme.typography.displayMedium
    )

    BulletPoints(modifier = Modifier.padding(top = 16.dp)) {
        BulletPoint(visible = step >= 1) {
            Row {
                Text("Test your software and increased your test coverage")
            }
        }
        BulletPoint(visible = step >= 2) {
            Row {
                Text("Improved communication")
            }
        }
        BulletPoint(visible = step >= 3) {
            Row {
                Text("Improved collaboration")
            }
        }
    }
}
