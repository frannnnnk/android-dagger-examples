package com.itdog.example_06

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
class ABModule {

    lateinit var a2 : A2

    lateinit var b2 : B2
    constructor() {
    }
    constructor(a2: A2, b2: B2) {
        this.a2 = a2
        this.b2 = b2
    }
    @Provides
    fun providerA2() : A2 = A2()
    @Provides
    fun providerB2() : B2 = B2()
    @Provides
    fun providerSp(context : Context) :SharedPreferences = context.getSharedPreferences("def", Context.MODE_PRIVATE)
}