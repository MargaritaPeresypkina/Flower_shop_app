import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val repository = remember { FlowerShopRepository() }
    val flowerList = remember { mutableStateListOf(*repository.flowers.toTypedArray()) }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "flowerList"
    ) {
        composable("flowerList") {
            ProductList(
                flowerList = flowerList,
                onNavigateToAdd = { navController.navigate("addFlower") },
                onRemoveFlower = { flower -> flowerList.remove(flower) }
            )
        }
        composable("addFlower") {
            AddFlowerScreen(
                onAddFlower = { newFlower ->
                    flowerList.add(newFlower)
                    navController.navigateUp() // Возвращаемся к списку
                }
            )
        }
    }
}
