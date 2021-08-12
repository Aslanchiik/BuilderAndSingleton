package com.example.builderandsingleton

import android.graphics.Color

class PatternSingleton private constructor() {

    companion object {
        private var instance: PatternSingleton? = null

        fun getInstance(): PatternSingleton? {
            if (instance == null)
                instance = PatternSingleton()
            return instance
        }
    }

    fun getData(): String {
        val builder: PatternBuilder =
            ConfigurationBuilder().setSensitivity(200).setColor(Color.BLACK).setNumber(45).build()
        return builder.toString()
    }
}