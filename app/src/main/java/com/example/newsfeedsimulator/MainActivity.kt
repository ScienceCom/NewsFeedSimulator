package com.example.newsfeedsimulator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MainActivity : AppCompatActivity() {

    private val _readCount = MutableStateFlow(0)
    val readCount: StateFlow<Int> = _readCount.asStateFlow()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            simulateNewsFeed()
        }

        lifecycleScope.launch {
            readCount.collect { count ->
                Log.d("PRAKTIKUM", "JUMLAH BERITA DIBACA: $count")
            }
        }
    }

    fun newsFlow(): Flow<String> = flow {
        val listBerita = listOf("Update Kotlin 2.0", "Belajar Coroutines", "Tips Android", "Flow itu Mudah")
        for (item in listBerita) {
            delay(2000) // Delay 2 detik sesuai tugas
            emit(item)
        }
    }

    suspend fun simulateNewsFeed() {
        newsFlow()
            .filter { it.contains("Kotlin") || it.contains("Flow") } // Filter kata kunci
            .map { "HOT NEWS: $it" } // Transformasi teks
            .catch { e -> Log.e("PRAKTIKUM", "Error: ${e.message}") } // Error handling
            .collect { hasil ->
                Log.d("PRAKTIKUM", "Tampil: $hasil")

                val detail = getDetailAsync()
                Log.d("PRAKTIKUM", "Detail: $detail")

                _readCount.value++ // Update State
            }
    }

    suspend fun getDetailAsync(): String = coroutineScope {
        val deferred = async(Dispatchers.IO) {
            delay(500)
            "Konten Berhasil Dimuat"
        }
        deferred.await()
    }
}