package slides

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.kodein.cup.PreparedSlide
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode


val gherkinSample3b by PreparedSlide {
    val sourceCode = rememberSourceCode(language = "text") {
        """
            Given an existing bet
            ...
            * with selections
              | id | result             | eligibility             |
              | 1  | <selectionResult1> | <selectionEligibility1> |
              | 2  | <selectionResult2> |                         |
            ...
            Then the bet is updated
            * with SuperSub result <newSuperSubResult>
        """.trimIndent()
    }

    slideContent {

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
