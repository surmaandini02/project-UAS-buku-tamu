package com.informatika19100065.surmaandini_19100065_bukutamu.network

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class koneksi : AppCompatActivity() {
    val BaseUrl = "https://jsonplaceholder.typicode.com/"
    val retrofit = Retrofit.Builder()
        .baseUrl(BaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service: ApiService = retrofit.create(ApiService::class.java)

    }
}