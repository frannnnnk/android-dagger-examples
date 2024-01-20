package com.itdog.example_03.component

import com.itdog.example_03.module.ActivityModule
import com.itdog.example_03.ForActivity
import com.itdog.example_03.MainActivity
import com.itdog.example_03.OtherClass
import dagger.Component

// dependencies : 当前Component依赖于ApplicationComponent，在查找注入类的时候不仅要在ActivityModule中查找，
// 还需要去ApplicationComponent中的Module中查找。
@Component(dependencies = [(ApplicationComponent::class)], modules = [(ActivityModule::class)])
@ForActivity
interface ActivityComponent {

    fun injectMainActivity(activity: MainActivity)

    fun injectOtherClass(otherClass: OtherClass)

}