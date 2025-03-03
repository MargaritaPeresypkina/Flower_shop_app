import androidx.compose.runtime.MutableState


data class flower(
    val name: String,
    val description: String,
    val price: Float,
    val favorite: MutableState<Boolean>,
    val image: Int
)