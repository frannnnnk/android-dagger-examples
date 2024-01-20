package com.itdog.example_04

import android.util.Log
import javax.inject.Inject

class OtherClass {

    @Inject
    lateinit var appBean : ApplicationBean

    constructor(appComponent: ApplicationComponent) {
        appComponent.activityComponent().injectOtherClass(this)

        Log.i(TAG, "appBean in otherClass = ${appBean.hashCode()}")
    }

    companion object {
        private const val TAG = "Dagger"
    }

}