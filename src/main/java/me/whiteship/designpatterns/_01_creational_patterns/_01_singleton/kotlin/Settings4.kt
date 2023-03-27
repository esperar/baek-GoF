package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings4 private constructor() {

    companion object {
        class SettingsHolder{
            companion object {
                val SETTINGS = Settings4()
            }
        }

        fun getInstance() = SettingsHolder.SETTINGS
    }
}