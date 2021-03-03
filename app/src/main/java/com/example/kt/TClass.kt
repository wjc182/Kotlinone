package com.example.kt
//constructor表示构造函数 只能主构造函数var参数全局
 class TClass constructor(var name:String){

    //初始化块
    init {
        println("我是初始化块，我最先被调用，优先于次级构造函数")
    }
    var sex:Char=' '
    var age=0
    //如果有主构造函数，次级构造函数 必须重写主构造函数
    constructor(name: String,age :Int,sex:Char):this(name){
        this.sex=sex
        this.age=age
        println(this.name)
        println(age)
        println(sex)
    }
}