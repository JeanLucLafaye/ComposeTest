package fr.jll.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.jll.composetest.model.Param
import fr.jll.composetest.model.Topic
import fr.jll.composetest.ui.TopicList
import fr.jll.composetest.ui.theme.ComposeTestTheme
import fr.jll.composetest.ui.theme.ParamList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
//            }
//            val scrollState = rememberScrollState()
//            Column(
//                modifier = Modifier.verticalScroll(scrollState)
//            ) {
//                for (i in 1..50) {
//                    Text(
//                        text = "Item $i",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Justify,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
                val params = mutableListOf<Param>(
                    Param("Account", "ON"),
                    Param("Subscription", "OFF"),
                    Param("Param", "ON"),
                    Param("Account2", "ON"),
                    Param("Subscription2", "OFF"),
                    Param("Account3", "ON"),
                    Param("Account4", "ON"),
                    Param("Subscription3", "OFF"),
                    Param("Account5", "ON"),
                    Param("Account6", "ON"),
                    Param("Subscription4", "OFF"),
                    Param("Account7", "ON"),
                    Param("Account8", "ON"),
                    Param("Subscription5", "OFF"),
                    Param("Account9", "ON"),
                )
                ParamList(params = params)

                val topics = mutableListOf<Topic>(
                    Topic("Account", listOf(Param("Param Acc 1", "ON"))),
                    Topic("Subscription",listOf(Param("Param Sub 1", "ON"))),
                    Topic("Transfer",listOf(Param("Param Tr 1", "ON"))),
                )
                TopicList(topics)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Greeting("Android")
    }
}