package slides.components

import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import net.kodein.cup.ui.SpanStyleSheet

object MyStyleSheet : SpanStyleSheet() {
    val em by registerMarker(
        SpanStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 1.2.em
        )
    )
}