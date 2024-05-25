package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import slides.components.MyStyleSheet

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
