package uz.pdp.hilt.data.api

import retrofit2.Response
import retrofit2.http.GET
import uz.pdp.hilt.data.model.User

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}