package com.itdog.example_05

import javax.inject.Inject

class Test3 {

    lateinit var strings : Set<String>

    @Inject constructor(strings : Set<String>) {
        this.strings = strings
    }
}