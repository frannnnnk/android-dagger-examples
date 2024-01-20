package com.itdog.example_02

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BeanModule {

    @Provides
    @Singleton
    fun providerBean() : BeanNeedParam {
        var param : BeanNeedParam = BeanNeedParam()
        return param
    }

}