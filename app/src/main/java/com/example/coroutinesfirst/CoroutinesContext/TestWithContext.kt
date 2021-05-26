package com.example.coroutinesfirst.CoroutinesContext

import kotlinx.coroutines.*

object TestWithContext {

    fun Test() {
        runBlocking {
            val job = launch {
                try {
                    repeat(1000) {
                        delay(100)
                        println("hello coroutines")
                    }
                } finally {
                    println("frint finally")
                    withContext(NonCancellable) {
                        repeat(2){
                            delay(100)
                            println("non $it")
                        }
                    }
                }
            }
            delay(1000)
            job.cancel()
            println("cancel coroutines")
        }
    }
}