package com.itdog.example_03

import android.app.Application
import android.util.Log
import com.itdog.example_03.bean.ApplicationBean
import com.itdog.example_03.component.ApplicationComponent
import com.itdog.example_03.component.DaggerApplicationComponent
import javax.inject.Inject

class DaggerApplication : Application() {

    var appComponent : ApplicationComponent?= null

    @Inject
    lateinit var appBean1 : ApplicationBean

    @Inject
    lateinit var appBean2 : ApplicationBean

    override fun onCreate() {
        super.onCreate()
        ensureAppComponent()
        appComponent?.inject(this)

        Log.i(TAG, "onCreate: appBean1 = ${appBean1.hashCode()}")
        Log.i(TAG, "onCreate: appBean2 = ${appBean2.hashCode()}")
    }

    private fun ensureAppComponent() {
        if (appComponent == null) {
            appComponent = DaggerApplicationComponent.create()
        }
    }

    companion object {
        val TAG : String = "Dagger"
    }
}