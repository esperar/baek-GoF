package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings4 private constructor() {

    companion object {
        val instance: Settings4 by lazy { SettingsHolder.SETTINGS } // by lazy를 통해 객체가 필요한 시점까지 초기화 지연
    }

    private object SettingsHolder {
        val SETTINGS = Settings4()
    }
}