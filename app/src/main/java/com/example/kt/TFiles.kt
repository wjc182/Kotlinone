package com.example.kt

open class TFiles(name:String){

    //网络请求的数据会有延迟 我们使用延迟初始化关键字修饰lateinit,不需要当时赋值，需要使用字段之前赋值
//    lateinit var sex:String

    var name:String=""
        //get不需要返回自定义内容直接用get
        get
        //get方法需要返回自定义内容，重写方法体
//       get(a) {
//           return name
//       }
        //set方法必须使用幕后字段Field 否则会死循环内存溢出
        set(value) {
            if(value!=""){
                field=value
            }
        }
//    //父类方法
//    fun getFather(){
//
//    }
}