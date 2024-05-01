package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import slides.components.Link
import slides.components.MyStyleSheet

val modernStack by Slide(stepCount = 3) { step ->
    Text(
        text = styled(MyStyleSheet) { "Can y use it in my stack?" },
        style = MaterialTheme.typography.displayMedium
    )
    AnimatedVisibility(visible = step >= 1) {
        Column(modifier = Modifier.padding(top = 8.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "Available for a lot of modern languages, such as Kotlin, Clojure, Python, Javascript (and TS), Go, Rust, etc."
            )
            Link("https://cucumber.io/docs/installation/", "https://cucumber.io/docs/installation/")
        }
    }
}
