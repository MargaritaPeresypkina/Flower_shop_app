import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flowershop.R



@Composable
fun ProductList(
    flowerList: MutableList<flower>,
    onNavigateToAdd: () -> Unit,
    onRemoveFlower: (flower) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.teal_700))
    ) {
        // Заголовок
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 15.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Flowers",
                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Medium, color = Color.White)
            )
            Icon(
                Icons.Default.Add,
                contentDescription = "",
                tint = Color.White,
                modifier = Modifier.clickable { onNavigateToAdd() }
            )
        }

        // Список цветов
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            item {
                Text(
                    text = "Favorites",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.W400, color = Color.White)
                )
                Column(Modifier.fillMaxWidth()) {
                    for (flower in flowerList.filter { it.favorite.value }) {
                        ListItemFlower(flower, flower.favorite, onDelete = { onRemoveFlower(flower)})
                    }
                }
                Text(
                    text = "Others",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.W400, color = Color.White)
                )
                Column(Modifier.fillMaxWidth()) {
                    for (flower in flowerList.filter { !it.favorite.value }) {
                        ListItemFlower(flower, flower.favorite, onDelete = { onRemoveFlower(flower)})
                    }
                }
            }
        }
    }
}


