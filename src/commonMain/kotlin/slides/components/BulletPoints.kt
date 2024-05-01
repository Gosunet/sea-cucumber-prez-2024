package slides.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class BulletPointsBuilder internal constructor() {
    internal val contents = ArrayList<Pair<Boolean, @Composable () -> Unit>>()

    fun BulletPoint(visible: Boolean = true, content: @Composable () -> Unit) {
        contents += visible to content
    }
}

private enum class BulletPointsSlotsEnum { Main, Dependent }

@Composable
private fun BulletPointsContent(
    contents: List<Pair<Boolean, @Composable () -> Unit>>,
    horizontalAlignment: Alignment.Horizontal,
    spacedBy: Dp
) {
    Column(
        horizontalAlignment = horizontalAlignment,
    ) {
        contents.forEachIndexed { index, (visible, content) ->
            AnimatedVisibility(visible) {
                Column {
                    if (index != 0) Spacer(Modifier.height(spacedBy))
                    Row {
                        Text(color = MaterialTheme.colorScheme.primary, text = "• ")
                        content()
                    }
                }
            }
        }
    }
}

@Composable
fun BulletPoints(
    modifier: Modifier = Modifier,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    spacedBy: Dp = 8.dp,
    builder: BulletPointsBuilder.() -> Unit
) {
    val contents = BulletPointsBuilder().apply(builder).contents
    SubcomposeLayout(modifier) { constraints ->
        val mainPlaceable = subcompose(BulletPointsSlotsEnum.Main) {
            BulletPointsContent(contents.map { true to it.second }, horizontalAlignment, spacedBy)
        }.first().measure(constraints)

        val sizedPlaceable = subcompose(BulletPointsSlotsEnum.Dependent) {
            BulletPointsContent(contents, horizontalAlignment, spacedBy)
        }.first().measure(constraints)

        layout(mainPlaceable.width, sizedPlaceable.height) {
            sizedPlaceable.place(0, 0)
        }
    }
}
