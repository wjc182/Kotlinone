package com.example.kotlinxc

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

//主线阻塞
fun main() = runBlocking <Unit>{
    //构建器
    launch {
        delay(3000L)
        println("1---第一个任务")
    }

    coroutineScope {
        launch {
            delay(2000L)
            println("2---第二个任务")
        }
        delay(1000L)
        println("3---第三个任务")
    }

    println("4---第四个任务")

    //挂起函数
    /*
    *“被suspend关键字所修饰的函数叫做挂起函数，
    * 挂起函数（suspending function）可以像普通函数一样用在协程当中，
    * 不过它的一个特性在于可以使用其他的挂起函数，
    * 重点：挂起函数只能用在协程或者另一个挂起函数中。”
     */
    //变量
    var  times= measureTimeMillis {
        var one = doSomethingOne()
        var two = doSomethingTwo()
        var three = doSomethingThree()
        println("结果${one + two + three}")
    }
    //打印
    println("时间毫秒："+times)
}

suspend fun doSomethingOne(): Int{
    delay(2000L)
    return  10
}

suspend fun  doSomethingTwo(): Int{
    delay(1000L)
    return 5
}

suspend fun  doSomethingThree(): Int{
    delay(1000L)
    return 20
}