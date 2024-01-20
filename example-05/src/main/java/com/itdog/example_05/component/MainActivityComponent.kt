package com.itdog.example_05.component

import android.app.Activity
import com.itdog.example_05.ForActivity
import com.itdog.example_05.MainActivity
import com.itdog.example_05.module.AndroidModule
import com.itdog.example_05.module.ModuleA
import com.itdog.example_05.module.ModuleB
import com.itdog.example_05.module.MyModule
import com.itdog.example_05.module.MyModule2
import dagger.Component
import javax.inject.Singleton


@Component(dependencies = [ApplicationComponent::class], modules = [ModuleA::class, ModuleB::class, MyModule::class, MyModule2::class])
@ForActivity
interface MainActivityComponent {
    fun inject(activity: MainActivity)

    fun strings() : Set<String>

    fun longsByString(): Map<String, Long>

    fun stringsByEnum(): Map<MyModule2.MyEnum, String>
}