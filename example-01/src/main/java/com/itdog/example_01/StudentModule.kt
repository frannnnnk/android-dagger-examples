package com.itdog.example_01

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class StudentModule {
    @Named("zs")
    @Provides
    @Singleton
    fun providerStudentZs() : Student {
        return Student("张三", 22)
    }

    @Named("ls")
    @Provides
    fun providerStudentLs() : Student {
        return Student("李四", 23)
    }
}