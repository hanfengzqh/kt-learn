package com.zqh.kt

class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}

fun main(args: Array<String>) {
    Zoo(Dog()).back()
}

interface Animal {
    fun back()
}

class Dog : Animal {
    override fun back() {
        print("wang")
    }
}

class Zoo(animal: Animal) : Animal by animal

