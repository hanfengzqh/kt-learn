package com.zqh.kt

import com.google.gson.Gson

inline fun <reified T> Gson.fromJson(json: String): T {
    return fromJson(json, T::class.java)
}

class View<T>(val clazz: Class<T>) {
    val presenter by lazy { clazz.newInstance() }

    companion object {
        inline operator fun <reified T> invoke() = View(T::class.java)
    }
}
class Presenter{
    override fun toString(): String {
        return "super.toString()"
    }
}

fun main(args: Array<String>) {
    val presenter = View<Presenter>().presenter
    val presenter1 = View.Companion.invoke<Presenter>().presenter
    println(presenter)
    println(presenter1)
}