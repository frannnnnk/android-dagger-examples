package com.itdog.example_05.component

import android.content.Context
import android.location.LocationManager
import com.itdog.example_05.DemoApplication
import com.itdog.example_05.module.AndroidModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidModule::class])
interface ApplicationComponent {
    fun inject(application: DemoApplication)

    fun getLocationManager() : LocationManager

    fun getContext() : Context
}