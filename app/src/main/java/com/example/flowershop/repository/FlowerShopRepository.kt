import androidx.compose.runtime.mutableStateOf
import com.example.flowershop.R


class FlowerShopRepository {
    val flowers = mutableListOf(
        flower("Георгины", "Георгины", 12.9f, mutableStateOf(true) , R.drawable.georgins),
        flower("Антуриум", "Антуриум", 13.9f, mutableStateOf(false), R.drawable.anthurium),
        flower("Лотос", "Лотос", 40.0f, mutableStateOf(true), R.drawable.lotos),
        flower("Георгины1", "Георгины", 12.9f, mutableStateOf(false), R.drawable.georgins),
        flower("Антуриум1", "Антуриум", 13.9f, mutableStateOf(true), R.drawable.anthurium),
        flower("Лотос1", "Лотос", 40.0f, mutableStateOf(true), R.drawable.lotos),
        flower("Георгины2", "Георгины", 12.9f, mutableStateOf(true), R.drawable.georgins),
        flower("Антуриум2", "Антуриум", 13.9f, mutableStateOf(false), R.drawable.anthurium),
        flower("Лотос2", "Лотос", 40.0f, mutableStateOf(true), R.drawable.lotos),
        flower("Георгины3", "Георгины", 12.9f, mutableStateOf(false), R.drawable.georgins),
        flower("Антуриум3", "Антуриум", 13.9f, mutableStateOf(true), R.drawable.anthurium),
        flower("Лотос3", "Лотос", 40.0f, mutableStateOf(true), R.drawable.lotos)
    )
}

