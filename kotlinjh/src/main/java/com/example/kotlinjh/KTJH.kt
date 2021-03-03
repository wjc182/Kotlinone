package com.example.kotlinjh
//程序入口

fun main(){
    //集合
    val numbers = mutableListOf(1,2,3,4)
    //添加
    numbers.add(5)
    //删除
    numbers.remove(1)
    //特定位置替换
    numbers[0] = 0
    //洗牌打乱
   // numbers.shuffle()
    //打印
    println(numbers)
    println("---------------------------`")
    //倒序
    println(numbers.reversed())
    println("---------------------------`")
    println("个数: ${numbers.count()}")
    println("最大值: ${numbers.max()}")
    println("最小值: ${numbers.min()}")
    println("平均数: ${numbers.average()}")
    println("和: "+numbers.sum())

    //迭代器
    val numbersIterator = numbers.iterator()
    //循环
    while (numbersIterator.hasNext()){
        println(numbersIterator.next())
    }
    println("---------------------------`")
    //for循环
    for (item in numbers){
        println(item)
    }

}