package com.example.coroutinesfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutinesfirst.CoroutinesContext.TestDispatchers
import com.example.coroutinesfirst.CoroutinesContext.TestWithContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestWithContext.Test()
    }
}