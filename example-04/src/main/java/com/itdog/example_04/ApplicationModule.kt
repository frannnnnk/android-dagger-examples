package com.itdog.example_04

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun providerAppBean() : ApplicationBean = ApplicationBean()

}