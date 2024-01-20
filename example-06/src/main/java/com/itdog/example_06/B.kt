package com.itdog.example_06

import android.util.Log
import javax.inject.Inject

class B @Inject constructor() {

    fun someThingB() = Log.e("dragger", "Some Thing B!")

}