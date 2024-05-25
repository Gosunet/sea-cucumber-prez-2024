package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import sea_cucumber_prez_2024.generated.resources.Res
import sea_cucumber_prez_2024.generated.resources.run

@OptIn(ExperimentalResourceApi::class)
val runIt by Slide {
    Image(
        painter = painterResource(Res.drawable.run),
        contentDescription = "Image of a cucumber test result",
        modifier = Modifier.scale(2f).shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp))
    )
}