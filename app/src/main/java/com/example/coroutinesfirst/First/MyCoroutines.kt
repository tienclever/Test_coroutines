package com.example.coroutinesfirst.First

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//fun main() {
//    GlobalScope.launch {
//        delay(1000L)
//        println("hello")
//    }
//
//    println("word")
//    Thread.sleep(3000L)
//}
//fun main() {
//    val start = System.currentTimeMillis()
//    runBlocking {
//        repeat(1_000_000){
//            launch {
//                println("hello")
//            }
//        }
//    }
//    val end = System.currentTimeMillis()
//    println("Time : ${end-start} ms")
//}