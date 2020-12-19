package com.zqh.kt

class User(var name: String, var age: Int){
    operator fun component1() = name
    operator fun component2() = age

}