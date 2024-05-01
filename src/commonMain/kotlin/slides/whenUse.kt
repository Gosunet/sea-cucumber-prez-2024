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

val whenUse by Slide(stepCount = 3) { step ->
    Text(
        text = styled(MyStyleSheet) { "${+em}When${-em} to use Cucumber (and gherkin)?" },
        style = MaterialTheme.typography.displayMedium
    )

    BulletPoints(modifier = Modifier.padding(top = 16.dp)) {
        BulletPoint(visible = step >= 1) {
            Row {
                Text("When you want to test behaviors")
            }
        }
        BulletPoint(visible = step >= 2) {
            Row {
                Text("When you don't want to test low-level details of your software")
            }
        }
    }
}
