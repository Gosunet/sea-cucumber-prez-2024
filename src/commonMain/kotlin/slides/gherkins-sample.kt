package slides

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import net.kodein.cup.PreparedSlide
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode


val gherkinSample by PreparedSlide {
    val sourceCode = rememberSourceCode(language = "text") {

        """
            Feature: Login

            Scenario: Successful login
              Given I am on the login page
              When I enter my username and password
              And I click the login button
              Then I should be logged in
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
