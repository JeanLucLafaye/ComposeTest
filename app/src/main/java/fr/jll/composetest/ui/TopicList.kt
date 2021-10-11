package fr.jll.composetest.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.jll.composetest.model.Param
import fr.jll.composetest.model.Topic
import fr.jll.composetest.ui.theme.ParamListItem

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TopicList(
    topics: List<Topic>,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        LazyColumn(Modifier.fillMaxWidth()) {
//            // FIXME: tihs should be done in the ViewModel
//            val grouped: Map<Char, List<Param>> = params.groupBy { it.name[0] }
//
//            grouped.forEach { (initial, param) ->
//                stickyHeader {
//                    CharacterHeader(initial)
//                }
//                items(param) { param ->
//                    ParamListItem(
//                        param,
//                        Modifier.fillMaxWidth()
//                    )
//                }
//            }
            topics.forEachIndexed { index, topic ->
                stickyHeader {
                    TopicHeader(topicName = topic.name)
                }
                topic.params.forEach { param ->
//                itemsIndexed(topics)
                    item(param,
//                    TopicListItem(topic = )
                        ParamListItem(param = param)
                    )
                }
            }
        }

//        ScrollToTopButton(onClick = { /* TODO */ })
    }
}

@Composable
fun TopicListItem(topic: Topic) {
//    Column {
//        Card(
//            Modifier
//                .fillMaxWidth()
//                .padding(8.dp), elevation = 8.dp) {
//            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
//            Text("This is a card for ${param.name}")
//        }
//    }
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = topic.name
        )
        Text(
            text = topic.value
        )
    }
}

@Composable
fun TopicHeader(topicName: String) {
    Column {
        Card(
            Modifier
                .fillMaxWidth()
                .padding(8.dp), elevation = 8.dp) {
            Text(topicName)
        }
    }
}