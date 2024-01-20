package com.itdog.example_02

import android.app.Application

class DaggerApplication : Application() {
    lateinit var beanComponent: BeanComponent
    override fun onCreate() {
        super.onCreate()
        beanComponent = DaggerBeanComponent.create()
    }
}