package com.itdog.example_03.component

import com.itdog.example_03.DaggerApplication
import com.itdog.example_03.bean.ApplicationBean
import com.itdog.example_03.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Component(modules = [(ApplicationModule::class)])
@Singleton
interface ApplicationComponent {

    fun inject(application: DaggerApplication)

    // 作用是将该Component中的ApplicationBean对象暴露给其他Component使用，相当于AIDL语言中的方法声明。
    fun providerAppBean() : ApplicationBean

}