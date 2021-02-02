package uz.pdp.hilt.data.api

import retrofit2.Response
import uz.pdp.hilt.data.model.User
import javax.inject.Inject

class ApiHelper @Inject constructor(private val apiService: ApiService) {

    suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}