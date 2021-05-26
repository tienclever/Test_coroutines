package com.example.coroutinesfirst.CoroutinesContext

import android.util.Log
import com.example.coroutinesfirst.MainActivity
import kotlinx.coroutines.*

object TestDispatchers {

    fun TestDispatchersOne(){
//        GlobalScope.launch(Dispatchers.Default){
//            Log.d(MainActivity::class.java.simpleName, "Default run in ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.IO){
//            Log.d(MainActivity::class.java.simpleName, "IO run in ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.Unconfined){
//            Log.d(MainActivity::class.java.simpleName, "befor Unconfined run in ${Thread.currentThread().name}")
//            delay(1000)
//            Log.d(MainActivity::class.java.simpleName, "Unconfined run in ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(Dispatchers.Main){
//            Log.d(MainActivity::class.java.simpleName, "Main run in ${Thread.currentThread().name}")
//        }
//        GlobalScope.launch(newSingleThreadContext("my thread")){
//            Log.d(MainActivity::class.java.simpleName, "run in ${Thread.currentThread().name}")
//        }
    }
}