package com.example.builderandsingleton

import android.graphics.Color

class PatternBuilder
    (
    val number: Int = 0,
    val color: Int = 0,
    val sensitivity: Int = 0,
) {

    inner class ConfigurationBuilder() {

        var number: Int = 0
        var color: Int = 0
        var sensitivity: Int = 0

        fun setSensitivity(value: Int): ConfigurationBuilder {
            this.sensitivity = value
            return this
        }

        fun setNumber(value: Int): ConfigurationBuilder {
            this.number = value
            return this
        }

        fun setColor(value: Int): ConfigurationBuilder {
            this.color = value
            return this
        }

        fun build(): PatternBuilder = PatternBuilder(
            number = number,
            color = color,
            sensitivity = sensitivity
        )
    }
}


