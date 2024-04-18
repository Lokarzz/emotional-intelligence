package com.karlo.emotionalintelligence.util.assets

import android.content.res.AssetManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException
import java.io.InputStream

class AssetJsonRetriever(private val assetManager: AssetManager) {

    suspend fun loadJSONFromAssets(fileName: String): String? {
        return withContext(Dispatchers.IO) {
            var json: String? = null
            try {
                val inputStream: InputStream = assetManager.open(fileName)
                val size: Int = inputStream.available()
                val buffer = ByteArray(size)
                inputStream.read(buffer)
                inputStream.close()
                json = String(buffer, charset("UTF-8"))
            } catch (e: IOException) {
                e.printStackTrace()
            }
            json
        }
    }
}