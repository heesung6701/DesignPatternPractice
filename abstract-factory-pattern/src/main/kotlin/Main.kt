import com.quokkaman.AbstractProduct
import com.quokkaman.AndroidUiFactory
import com.quokkaman.WebUiFactory
import com.quokkaman.iOSUiFactory

fun main() {
    listOf(AndroidUiFactory(), iOSUiFactory(), WebUiFactory()).forEach { factory ->
        listOf(
            factory.makeButton(),
            factory.makeImage(),
            factory.makeText(),
            factory.makeImageButton()
        ).forEach(
            AbstractProduct::paint
        )
    }
}