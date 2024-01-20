package com.itdog.example_02

import dagger.Component
import javax.inject.Singleton

@Component(modules = [(BeanModule::class)])
@Singleton
interface BeanComponent {
    fun injectMainActivity(activity: MainActivity);

    fun injectOtherClass(otherClass: OtherClass);
}