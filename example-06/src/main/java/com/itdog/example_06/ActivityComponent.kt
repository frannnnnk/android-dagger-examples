package com.itdog.example_06

import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Subcomponent(modules = [AndroidInjectionModule::class])
interface ActivityComponent : AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder:AndroidInjector.Builder<BaseActivity>()

}