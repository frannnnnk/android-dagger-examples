package com.itdog.example_04

import dagger.Subcomponent

@Subcomponent(modules = [(ActivityModule::class)])
@ForActivity
interface ActivityComponent {

    fun injectMainActivity(activity: MainActivity)

    fun injectOtherClass(otherClass: OtherClass)

}