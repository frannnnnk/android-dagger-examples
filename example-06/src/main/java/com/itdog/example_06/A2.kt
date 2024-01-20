package com.itdog.example_06

import android.util.Log
import javax.inject.Inject

class A2 @Inject constructor() {
    fun someThingA2() = Log.e("dragger", "Some Thing A2!")
}