package com.informatika19100065.surmaandini_19100065_bukutamu.network

import retrofit2.http.GET

interface ApiService {
    @GET(value: " users")
    fun getUser (): call<List<ResponseUsersItem?>>
}