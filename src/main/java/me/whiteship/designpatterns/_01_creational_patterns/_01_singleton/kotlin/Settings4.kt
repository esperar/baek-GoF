package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings4 private constructor() {

    companion object {
        val instance: Settings4 by lazy { SettingsHolder.SETTINGS }
    }

    private object SettingsHolder {
        val SETTINGS = Settings4()
    }
}