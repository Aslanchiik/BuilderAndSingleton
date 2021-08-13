package com.example.builderandsingleton


object PatternSingleton {

    fun getData(): String {

        val builder = PatternBuilder().ConfigurationBuilder().setNumber(45).setSensitivity(300).setColor(0).build()
        return "${builder.color} ${builder.number}, ${builder.sensitivity}"
    }
}