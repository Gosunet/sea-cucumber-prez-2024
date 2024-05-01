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
import org.kodein.emoji.objects.book_paper.Notebook
import org.kodein.emoji.people_body.body_parts.Muscle
import org.kodein.emoji.people_body.person_role.Student
import org.kodein.emoji.symbols.other_symbol.CheckMark
import org.kodein.emoji.symbols.other_symbol.CheckMarkGreen
import slides.components.BulletPoints
import slides.components.MyStyleSheet

val conclusion by Slide(stepCount = 5) { step ->
    Text(
        text = styled(MyStyleSheet) { "Let's wrap it up!" },
        style = MaterialTheme.typography.displayMedium
    )
    BulletPoints(modifier = Modifier.padding(top = 16.dp)) {
        BulletPoint(visible = step >= 1) {
            Row {
                TextWithPlatformEmoji("Cucumber is still relevant ${Emoji.Muscle}")
            }
        }
        BulletPoint(visible = step >= 2) {
            Row {
                TextWithPlatformEmoji("You can use gherkins even if you are not using cucumber ${Emoji.Notebook}")
            }
        }
        BulletPoint(visible = step >= 3) {
            Row {
                TextWithPlatformEmoji("You probably have a cucumber implementation compatible with our language ${Emoji.CheckMarkGreen}")
            }
        }
        BulletPoint(visible = step >= 4) {
            Row {
                TextWithPlatformEmoji("BDD ${Emoji.Student}")
            }
        }
    }
}
