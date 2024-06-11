package com.edi_mariyanto.test_api

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.edi_mariyanto.test_api.vm.HomeViewModel

class MainActivity : ComponentActivity() {

    val TAG: String = "MainActivity"

    private lateinit var mainViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        mainViewModel = HomeViewModel()

        Log.i(TAG, "onCreate: "+ mainViewModel.getUsers())

    }

}

