import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flowershop.R



@Composable
fun ListItemFlower(
    flower: flower,
    favorite: MutableState<Boolean>,
    onDelete: () -> Unit
) {
    ListItem(
        headlineContent = {
            Text(
                text = flower.name,
                style = TextStyle(fontWeight = FontWeight.Medium, fontSize = 16.sp),
            )
        },
        supportingContent = { Text("${flower.price}$") },
        trailingContent = {
            Row(modifier = Modifier,
                horizontalArrangement = Arrangement.SpaceBetween){
                Icon(
                    if (favorite.value) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = "",
                    tint = colorResource(id = R.color.teal_700),
                    modifier = Modifier
                        .size(25.dp)
                        .padding(horizontal = 5.dp)
                        .clickable {
                            favorite.value = !favorite.value
                        }
                )
                Icon(
                    Icons.Default.Delete,
                    contentDescription = "Delete",
                    tint = Color.Red,
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            onDelete()
                        }
                )
            }

        },
        leadingContent = {
            Image(
                painter = painterResource(flower.image),
                contentDescription = "",
                modifier = Modifier.size(56.dp),
                contentScale = ContentScale.Crop
            )
        },
        shadowElevation = 2.dp
    )
    HorizontalDivider()
}
