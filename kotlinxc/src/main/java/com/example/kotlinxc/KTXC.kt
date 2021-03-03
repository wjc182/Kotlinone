package com.example.kotlinxc

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//程序入口，主线程
fun main(){
    //开启协子线程
   var jop = GlobalScope.launch {
        delay(2000L)//延迟主线程不阻塞
        println("开始")
    }
    //关闭子线程
    //jop.cancel()
    println("结束")
    //阻塞
    Thread.sleep(3000L)//阻塞线程、

    //另一种开启线程 子线程异步
    var netCallback = GlobalScope.async {

        println("当前线程")
        //返回值主线程
        "字符串"
    }
    //阻塞
    Thread.sleep(3000L)
    //打印
    println(netCallback.getCompleted())
}
