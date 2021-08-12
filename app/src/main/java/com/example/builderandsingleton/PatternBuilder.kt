package com.example.builderandsingleton

import android.graphics.Color

data class PatternBuilder (
    val number : Int,
    val color : Int,
    val sensitivity : Int
        )

 class ConfigurationBuilder () {

     var number: Int = 300
     var  color: Int= Color.BLACK
     var sensitivity :Int= 0

      fun setSensitivity (value : Int) : ConfigurationBuilder {
          this.sensitivity = value
          return this
      }
      fun setNumber (value : Int) : ConfigurationBuilder {
          this.number = value
          return this
      }

      fun setColor (value : Int) : ConfigurationBuilder {
          this.color = value
          return this
      }

      fun build () : PatternBuilder = PatternBuilder(
          number = number,
          color = color,
          sensitivity = sensitivity
       )
 }