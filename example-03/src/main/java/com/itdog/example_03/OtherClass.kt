package com.itdog.example_03

import android.util.Log
import com.itdog.example_03.bean.ActivityBean
import com.itdog.example_03.bean.ApplicationBean
import com.itdog.example_03.component.ActivityComponent
import javax.inject.Inject

class OtherClass {

    @Inject
    lateinit var appBean1 : ApplicationBean

    @Inject
    lateinit var appBean2 : ApplicationBean

    @Inject
    lateinit var activityBean : ActivityBean

    constructor(activityComponent: ActivityComponent) {
        activityComponent.injectOtherClass(this)
    }

    fun showMessage() {
        Log.i(TAG, "showMessage: appBean1 = ${appBean1.hashCode()}")
        Log.i(TAG, "showMessage: appBean2 = ${appBean2.hashCode()}")
        Log.i(TAG, "showMessage: activityBean = ${activityBean.hashCode()}")
    }

    companion object {
        val TAG = "Dagger"
    }
}