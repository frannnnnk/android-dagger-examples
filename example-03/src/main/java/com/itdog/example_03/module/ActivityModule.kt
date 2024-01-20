package com.itdog.example_03.module

import com.itdog.example_03.ForActivity
import com.itdog.example_03.bean.ActivityBean
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ForActivity
    fun providerActivityBean() : ActivityBean {
        return ActivityBean()
    }
}