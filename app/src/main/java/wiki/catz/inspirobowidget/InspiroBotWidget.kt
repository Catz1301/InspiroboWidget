package wiki.catz.inspirobowidget

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.LocalContext
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.ImageProvider
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.text.Text
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection

class InspiroBotWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {

        // In this method, load data needed to render the AppWidget.
        // look into 'withContext'

        provideContent {
            GlanceTheme {
                WidgetContent()
            }
        }
    }

}

@Composable
fun WidgetContent() {
    Box(
        modifier = GlanceModifier.fillMaxWidth()
        .background(GlanceTheme.colors.onPrimary),
//        verticalAlignment = Alignment.Top,
//        horizontalAlignment = Alignment.CenterHorizontally) {
    ){
        /*var tempFile: File = File.createTempFile("Tmp", ".jpg")
        val apiURL: URL = URL("https://inspirobot.me/api?generate=true")
        val apiURLConnection = apiURL.openConnection() as HttpURLConnection
        var imageLocation = "";
        var imageBitmap: Bitmap? = null
        try {
            val text = apiURLConnection.inputStream.bufferedReader().readText()
            Log.d("UrlTest", text)
            imageLocation = text;
            val imageURL: URL = URL(imageLocation)
            val imageURLConnection = imageURL.openConnection() as URLConnection
            imageBitmap = BitmapFactory.decodeStream(imageURL.openConnection().getInputStream()) as Bitmap

        } finally {
            apiURLConnection.disconnect()
        }
        androidx.glance.ImageProvider(bitmap = imageBitmap!!);*/
        androidx.glance.Image(
            provider = androidx.glance.ImageProvider(R.drawable.placeholder),
            contentDescription = "An image"
        )
        //Text(text = "This is where the image will be")
        Row(
            modifier = GlanceModifier.fillMaxWidth().background(GlanceTheme.colors.secondary),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalAlignment = Alignment.Bottom
        ) {
            androidx.glance.Button(text = "Save", onClick = {
//                Toast.makeText(, "Saving Not Yet Implemented", Toast.LENGTH_LONG).show()
            })
            androidx.glance.Button(text = "Refresh", onClick = {})
        }
    }
}