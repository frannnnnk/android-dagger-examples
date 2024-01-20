package com.itdog.example_06

import android.util.Log
import javax.inject.Inject

class A @Inject constructor() {
    fun someThingA() = Log.e("dragger", "Some Thing A!")
}