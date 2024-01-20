package com.itdog.example_05.module

import com.itdog.example_05.Test3
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntKey
import dagger.multibindings.IntoMap
import dagger.multibindings.LongKey
import dagger.multibindings.StringKey

@Module
class MyModule {

    @Provides
    @IntoMap
    @StringKey("Foo")
    fun providerFooValue() : Long = 100L

    @Provides
    @IntoMap
    @StringKey("Goo")
    fun providerGooValue() : Long = 100L

    @Provides
    @IntoMap
    @IntKey(1)
    fun providerIntValue() : Int = 100;

    @Provides
    @IntoMap
    @LongKey(1L)
    fun providerLongValue() : Long = 100L

    @Provides
    @IntoMap
    @ClassKey(Test3::class)
    fun providerTest3Value() : String = "value for test3"

}