package com.itdog.example_02

import android.util.Log
import javax.inject.Inject

class OtherClass {

    constructor(beanComponent: BeanComponent) {
        beanComponent.injectOtherClass(this)
        testOtherClass()
    }

    @Inject
    lateinit var param1 : BeanNeedParam

    @Inject
    lateinit var param2 : BeanNeedParam

    fun testOtherClass() {
        Log.i(TAG, "testOtherClass: param1 = ${param1.hashCode()}")
        Log.i(TAG, "testOtherClass: param2 = ${param2.hashCode()}")
    }

    companion object {
        val TAG : String = "SingleTest";
    }

}