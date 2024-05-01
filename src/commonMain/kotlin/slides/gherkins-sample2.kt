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
import net.kodein.cup.PreparedSlide
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode


val gherkinSample2 by PreparedSlide(stepCount = 4) {
    val sourceCode = rememberSourceCode(language = "text") {
        val given by marker(highlighted(1))
        val whenMarker by marker(highlighted(2))
        val then by marker(highlighted(3))

        """
            Feature: Vending Machine

            Scenario: Purchase a soda
              ${given}Given I have inserted 1.00 into the vending machine${X}
              ${whenMarker}When I select the soda button${X}
              ${then}Then the vending machine should dispense a soda${X}
              ${then}And the vending machine should return 0.25 change${X}
        """.trimIndent()
    }

    slideContent { step ->

        SourceCode(
            sourceCode = sourceCode,
            step = step,
            style = TextStyle(fontFamily = FontFamily.Monospace),
            theme = SourceCodeThemes.darcula,
            modifier = Modifier
                .background(Color.DarkGray, RoundedCornerShape(4.dp))
                .padding(8.dp)

        )
    }
}
