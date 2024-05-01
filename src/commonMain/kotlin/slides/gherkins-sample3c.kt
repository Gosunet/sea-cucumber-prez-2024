package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import sea_cucumber_prez_2024.generated.resources.Res
import sea_cucumber_prez_2024.generated.resources.gherkin_examples


@OptIn(ExperimentalResourceApi::class)
val gherkinSample3c by Slide {
    Image(
        modifier = Modifier.shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp)),
        painter = painterResource(Res.drawable.gherkin_examples),
        contentDescription = "Gherkin samples for outline scenario, this image show how gherkin make all the different input and output for the test easy to read and to configure",
    )
}
