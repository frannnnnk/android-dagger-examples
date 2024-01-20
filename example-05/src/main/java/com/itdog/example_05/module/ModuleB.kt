package com.itdog.example_05.module

import android.content.Context
import android.location.LocationManager
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import java.util.Arrays

@Module
class ModuleB {

    @Provides
    @ElementsIntoSet
    fun providerSomeThings(loc: LocationManager, ctx: Context) : Set<String> = HashSet<String>().apply {
        addAll(Arrays.asList("DEF", "GHI"))
    }

}