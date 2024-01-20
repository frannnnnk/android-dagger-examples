package com.itdog.example_05

import android.app.Application
import com.itdog.example_05.component.ApplicationComponent
import com.itdog.example_05.component.DaggerApplicationComponent
import com.itdog.example_05.module.AndroidModule

class DemoApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
            .builder()
            .androidModule(AndroidModule(this))
            .build()
        applicationComponent.inject(this)
    }
}