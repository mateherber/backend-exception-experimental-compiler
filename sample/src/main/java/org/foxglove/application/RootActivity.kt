package org.foxglove.application

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import kotlinx.android.synthetic.main.activity_root.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import org.foxglove.R

@UnstableDefault
class RootActivity : AppCompatActivity() {
    private val httpClient = HttpClient(OkHttp) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(Json(JsonConfiguration(strictMode = false)))
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_root)

        /**
         * First build issue
         * TODO uncomment next 6 lines to get the next issue
         **/
        GlobalScope.launch(Dispatchers.IO) {
            httpClient.get<WeatherResponseDto> {
                method = HttpMethod.Get
                url("https://www.metaweather.com/api/location/2487610")
            }
        }

        /**
         * Second build issue
         **/
        nameEditText.addTextChangedListener {
            Toast.makeText(this, "Foo", Toast.LENGTH_LONG).show()
        }
    }
}