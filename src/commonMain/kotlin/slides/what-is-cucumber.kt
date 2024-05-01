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


val whatIsCucumber by Slide(stepCount = 5) { step ->
    Text(
        text = styled(MyStyleSheet) { "${+em}What${-em} is Cucumber?" },
        style = MaterialTheme.typography.displayMedium
    )

    BulletPoints(modifier = Modifier.padding(top = 16.dp)) {
        BulletPoint(visible = step >= 1) {
            Row {
                TextWithPlatformEmoji("A vegetable ${Emoji.Cucumber}")
            }
        }
        BulletPoint(visible = step >= 2) {
            Row {
                Text("A software development tool")
            }
        }
        BulletPoint(visible = step >= 3) {
            Row {
                Text("A way of writing tests")
            }
        }
        BulletPoint(visible = step >= 4) {
            Row {
                Text("A DSL")
            }
        }
    }
}
