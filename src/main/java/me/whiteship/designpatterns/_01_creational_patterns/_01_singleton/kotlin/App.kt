package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin


fun main(){
    val instance = Settings.getInstance()
    val instance2 = Settings.getInstance()
    // instance === instance2 true
}