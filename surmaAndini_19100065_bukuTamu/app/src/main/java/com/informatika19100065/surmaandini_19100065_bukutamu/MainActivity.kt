package com.informatika19100065.surmaandini_19100065_bukutamu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        koneksi.service.getUser().enqueue(object : callback<list<responseUserItem?>>{
            override fun onFailure(call: Call<list<responseUserItem?>>, t:Throwable)}
                log.d("pesan1",t.localizetMassage)
    }
    override fun onResponse (
        call: Call<list<responseUserItem?>>,
        response: Response<list<responseUserItem?>>
    ){
        if (respone.isSuccesfull){
            log.d("pesan", response.body().toString());
        }
    }
}