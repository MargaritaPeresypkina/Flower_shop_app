import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp




@Composable
fun FlowerInfo(flower: flower, onNavigateBack: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(vertical = 40.dp, horizontal = 20.dp), verticalArrangement = Arrangement.SpaceAround) {
        Text(text = "${flower.name}", modifier = Modifier.padding(bottom = 20.dp).align(Alignment.CenterHorizontally))
        Image(
            painter = painterResource(flower.image),
            contentDescription = "",
            modifier = Modifier.size(300.dp).clip(RoundedCornerShape(10.dp)).padding(30.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = "${flower.description}", modifier = Modifier.padding(bottom = 30.dp).align(Alignment.CenterHorizontally))
        Text(text = "Price: ${flower.price}$", modifier = Modifier.padding(bottom = 20.dp).align(Alignment.CenterHorizontally))
        Button(onClick = onNavigateBack) {
            Text(text = "Back to List")
        }
    }
}