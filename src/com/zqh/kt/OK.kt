package com.zqh.kt

fun main() {
    TestKt.get()
}

fun main(args: Array<String>) {
    println(TestKt.get())
    val user = User("hello", 12)
    val (name, age) = user
    println(age)
    println(name)
    val mapOf = mapOf<String, String>("Key" to "Key", "value" to "value")

    for ((k, v) in mapOf) {
        println("$k ---- $v ")
    }
    println("************************")
//    for (i in 1..10) {
//        print(i)
//    }
//    println("************************")
//    for (i in 1 until 10) {
//        print(i)
//    }
//    println("************************")
//    for (i in 10 downTo 1) {
//        print(i)
//    }
//    println("************************")
//    for (i in 1..10 step 2) {
//        print(i)
//    }
//    println("************************")
    var r=0;
    repeat(5) {
//        print(it)
        r += it
        print(r)
    }

//    val arrayListOf = arrayListOf<String>("a", "b", "c", "d", "d")
//    for ((index, str) in arrayListOf.withIndex()) {
//        println("第${index}个元素是${str}")
//    }
//    val elementAt = arrayListOf.elementAt(1)
//
//    val firstOrNull = arrayListOf.firstOrNull()
}