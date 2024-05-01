package slides

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import net.kodein.cup.Slide

val notGherkins by Slide {
    Text(
        text = "Not Gherkin!",
        style = MaterialTheme.typography.displayMedium
    )
}
