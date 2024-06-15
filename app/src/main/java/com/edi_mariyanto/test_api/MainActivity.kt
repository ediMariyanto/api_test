package com.edi_mariyanto.test_api

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.edi_mariyanto.test_api.api.ApiConfig
import com.edi_mariyanto.test_api.vm.HomeViewModel
import com.example.example.UserResponse
import retrofit2.Call
import retrofit2.Response

class MainActivity : ComponentActivity() {

    val TAG: String = "MainActivity"

    private lateinit var mainViewModel: HomeViewModel
    private lateinit var tvMainText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        tvMainText = findViewById(R.id.tv_text_main)

        mainViewModel = HomeViewModel()

        subscribeData() //if using MVVM, data akan dikirimkan secara reactive menggunakan LiveData
        mainViewModel.getUsers()

//        getUsers()


    }



    fun subscribeData() {
        mainViewModel.usersDataList.observe(this) {
            println(it)
            tvMainText.text = it.toString()
        }
    }

}

