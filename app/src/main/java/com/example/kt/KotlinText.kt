package com.example.kt

import android.widget.Switch

//程序入口
fun main() {
//  println("你好啊Kotlin")
  //打印有返回值
// println(getSum(3,2))
  //打印无返回值
  val c=1
  val d=2
  val e="hello"
  // getPrintln(c,d,e)
  //函数为空：
  var aa: Int?=100
  var cc: Int=10
  //println(getNull(aa,cc))
  //条件表达式
  // println(getMax(4,3))
  //for循环
  //getFor()
  //while循环方法
  // getWhile()
  //java switch(kotlin中的when)
  //getWhen()
  //range区间
  // getRange()

  //类
  //var tClass=TClass("李白")
//  var tClass1=TClass("李白",1420,'男')

  //get set 方法
 // var tf=TFiles("")

 // tf.name="set方法"
  //打印
//  println(tf.name)

  //变量赋值
  var ss ={a:Int,b:Int ->
    println("变量赋值")
    a+b
  }

  println(ss(2,2))
  //有返回值方法
  println(getS(5,ss))
  //高阶函数
  var a: Int.(Int)-> Int=Int::div //除
  println(a(6,2))
}

//返回值
fun getS(s:Int,sss:(a:Int,b:Int)->Int):Int{
  return sss(10,5).plus(s)
}

//for循环
fun getFor() {
  val list:List<String> = listOf("a","b","c","d")
  for (li in list){
    println(li)
  }
  for (index in list.indices) {
    println("item at $index is ${list[index]}")
  }
}
//比大小函数
fun getMax(a: Int,b: Int)= if(a>b) a else b
//为空
fun getNull(aa:Int?,cc:Int) :Int?{
  return null
}


//while循环
fun getWhile(){
  //集合
  val list=listOf("a1","b1","c1","d1")
  var index = 0
  while (index < list.size) {
    println("item at $index is ${list[index]}")
    index++
  }
}
//java switch(kotlin中的when)
fun getWhen() {
  val mWhen:Any= 5
  when(mWhen){
    "a" ->{
      println("a")
    }
    5-> println(5)
    10-> println(10)
  }
}
//range区间判断
fun getRange() {
  val  a=10
  if(a in 1..20){
    println("在区间")
  }else{
    println("不在区间")
  }
}


//函数
fun getSum(a:Int,b:Int):String{
  println("调用第一个函数和为："+(a+b))
  return "返回字符串"
}
//无返回值函数
fun getPrintln(c:Int,d:Int,e:String){
  //打印
  println("打印单个变量$e")
  println("打印拼接变量${e+c+d}")
  println("打印变量和${c+d}")
  println("打印转换符美元符\$")
}