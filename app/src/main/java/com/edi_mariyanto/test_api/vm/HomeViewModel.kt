package com.edi_mariyanto.test_api.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import com.edi_mariyanto.test_api.api.ApiConfig
import com.example.example.UserResponse
import retrofit2.Call
import retrofit2.Response

class HomeViewModel() : ViewModel() {

    val TAG : String = "HomeViewModel"

    fun getUsers() {
        val getUsers = ApiConfig.getApiService().getUser()

        getUsers.enqueue(object: retrofit2.Callback<List<UserResponse>> {
            override fun onResponse(call: Call<List<UserResponse>>, response: Response<List<UserResponse>>) {
                if (response.isSuccessful){
                    println( "onResponse: "+ response.body())
                }
            }

            override fun onFailure(call: Call<List<UserResponse>>, t: Throwable) {
                Log.e(TAG, "onFailure: ",t )
            }


        })
    }


}