package com.itdog.example_06

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(subcomponents = [ActivityComponent::class])
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [ABModule::class])
    abstract fun mainActivityInjector() : MainActivity
}