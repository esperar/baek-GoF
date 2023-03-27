package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings2 private  constructor() {
    companion object {
        private val INSTANCE: Settings2 = Settings2()

        fun getInstance() = INSTANCE
    }
}