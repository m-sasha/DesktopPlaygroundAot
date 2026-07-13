
import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.hovered
import androidx.compose.foundation.style.rememberUpdatedStyleState
import androidx.compose.foundation.style.styleable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent

fun main(args: Array<String>) {
    val mainTime = System.currentTimeMillis()
    val shellTime = args.getOrNull(0)?.toLongOrNull()
    if (shellTime != null) {
        println("  From shell execution to main start: ${mainTime - shellTime}ms")
    }

    singleWindowApplication {
        MaterialTheme {
            LazyColumn(
                modifier = Modifier
                    .background(MaterialTheme.colors.primarySurface)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                items(
                    count = 100,
                    key = { it },
                    contentType = { "Item" }
                ) { index ->
                    HoverableItem(index)
                }
            }
        }

        LaunchedEffect(Unit) {
            window.addWindowListener(object: WindowAdapter() {
                override fun windowOpened(e: WindowEvent?) {
                    if (shellTime != null) {
                        val now = System.currentTimeMillis()
                        println("  From main start to window open: ${now - mainTime}ms")
                        println("Total: ${now - shellTime}ms")
                    }
                }
            })
        }
    }
}

@OptIn(ExperimentalFoundationStyleApi::class)
@Composable
private fun HoverableItem(index: Int) {
    val style = Style {
        background(Color.LightGray)
        hovered {
            background(Color.LightGray.copy(alpha = 0.5f))
        }
    }
    val source = remember { MutableInteractionSource() }
    val styleState = rememberUpdatedStyleState(source)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .styleable(styleState, style)
            .hoverable(source),
        contentAlignment = Alignment.Center,
    ) {
        Text("Item $index")
    }
}