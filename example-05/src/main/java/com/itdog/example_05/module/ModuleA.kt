package com.itdog.example_05.module

import android.content.Context
import android.location.LocationManager
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class ModuleA {

    @Provides
    @IntoSet
    fun providerOneString(loc : LocationManager, ctx : Context) : String = "ABC"

}