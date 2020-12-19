package com.zqh.kt

data class User1(var age: Int, var name: String)

fun main(args: Array<String>) {
    val user1 = User1(12, "zhangtao")
    //let与run都会返回闭包的执行结果,区别在于let有闭包参数而run没有闭包参数
//    val let = user1.let { val name = it.name
//        name
//    }

    val let = user1.let { it.name }
//    val run = user1.run { val age1 = this.age
//        age1
//    }
    val run = user1.run { this.age }
    println("let::$let ------ run::$run")
//also与apply都不返回闭包的结果，但是会返回调用者本身，区别在于alse有闭包参数,而apply没有闭包参数
    user1.also {
        it.age
        println("${it.age}")
    }.apply {
        this.name
        println("${this.name}")
    }.name = "hello"
    println("${user1.name}")

    //takeif的闭包会返回一个结果为false时，takeif函数会返回空
    //takeUnless 与takeIf相反，闭包的判断结果,为true时函数会返回空
    user1.takeIf { it.name.length > 0 }?.also { println(it.name) } ?: println("name为空")
    user1.takeUnless { it.name.length > 0 }?.apply { println("姓名为空") } ?: println("${user1.name}")

    //重复执行当前的闭包操作
    repeat(5) {
        println(user1.name)
    }
}