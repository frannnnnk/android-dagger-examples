package com.itdog.example_04

import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ForActivity
    fun providerActivityBean() : ActivityBean = ActivityBean()

}