package com.itdog.example_04

import android.app.Application
import javax.inject.Inject

class DaggerApplication : Application() {

    @Inject
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.create().inject(this)
    }

}