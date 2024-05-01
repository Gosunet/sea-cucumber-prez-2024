package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import net.kodein.cup.PreparedSlide
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode
import net.kodein.cup.ui.styled
import slides.components.MyStyleSheet

val howToImpl by PreparedSlide(stepCount = 2) {
    val sourceCode = rememberSourceCode(language = "kt") {
        // language=kotlin
        """
           Given("With odds {double}") { odds: Double ->
             bet = bet.copy(odds = odds)
           }
            
           When("a SuperSub selection is resulted") {
             betSettledEventHandler.onNewMessage(createMessage(event.copy(betId = context.betId.value)))
           }
        """.trimIndent()
    }

    slideContent { step ->
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = styled(MyStyleSheet) { "${+em}How${-em} to implement steps?" },
            style = MaterialTheme.typography.displayMedium
        )
        AnimatedVisibility(
            visible = step >= 1,
        ) {
            SourceCode(
                sourceCode = sourceCode,
                style = TextStyle(fontFamily = FontFamily.Monospace),
                theme = SourceCodeThemes.darcula,
                modifier = Modifier
                    .background(Color.DarkGray, RoundedCornerShape(4.dp))
                    .padding(8.dp)

            )
        }
    }
}
