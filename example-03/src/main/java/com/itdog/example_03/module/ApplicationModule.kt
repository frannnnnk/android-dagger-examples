package com.itdog.example_03.module

import com.itdog.example_03.bean.ApplicationBean
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun providerAppBean() : ApplicationBean = ApplicationBean()

}

