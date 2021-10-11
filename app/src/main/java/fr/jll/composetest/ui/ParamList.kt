package fr.jll.composetest.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import fr.jll.composetest.R
import fr.jll.composetest.model.Param

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ParamList(
    params: List<Param>,
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
            itemsIndexed(params) { index, param ->
                ParamListItem(param)
            }
        }

//        ScrollToTopButton(onClick = { /* TODO */ })
    }
}

@Composable
fun ParamListItem(param: Param) {
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
            text = param.name
        )
        Text(
            text = param.value
        )
    }
}

@Composable
fun CharacterHeader(character: Char) {
    Column {
        Card(
            Modifier
                .fillMaxWidth()
                .padding(8.dp), elevation = 8.dp) {
            Text(character.toString())
        }
    }
}