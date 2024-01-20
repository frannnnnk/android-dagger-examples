package com.itdog.example_05.module

import android.content.Context
import android.location.LocationManager
import com.itdog.example_05.DemoApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidModule constructor(private val app: DemoApplication){

    @Provides
    @Singleton
    fun applicationContext() : Context = this.app

    @Provides
    @Singleton
    fun providerLocationManager() : LocationManager =
            this.app.getSystemService(Context.LOCATION_SERVICE) as LocationManager

}