package com.itdog.example_05.module

import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import java.math.BigDecimal
import kotlin.reflect.KClass

@Module
class MyModule2 {

    enum class MyEnum {
        ABC, DEF
    }

    @MapKey
    annotation class MyEnumKey(val value: MyEnum)

    @MapKey
    internal annotation class MyNumberClassKey(val value: KClass<out Number>)

    @Provides
    @IntoMap
    @MyEnumKey(MyEnum.ABC)
    fun providerABCValue() : String = "value for ABC"

    @Provides
    @IntoMap
    @MyNumberClassKey(BigDecimal::class)
    fun providerBigDecimalValue() : String = "value for big decimal"

}