package com.itdog.example_06

import android.util.Log
import javax.inject.Inject

class C @Inject constructor(a : A, b : B) {
    fun someThingC() = Log.e("dagger", "do Some Thing C!")
}