package com.itdog.example_01

import dagger.Component
import javax.inject.Singleton

@Component(modules = [StudentModule::class])
@Singleton
public interface StudentComponent {
    fun injectMainActivity(activity: MainActivity)
}