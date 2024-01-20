package com.itdog.example_04

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ApplicationModule::class])
@Singleton
interface ApplicationComponent {

    fun inject(application: DaggerApplication)

    fun providerAppBean() : ApplicationBean

    fun activityComponent() : ActivityComponent

}