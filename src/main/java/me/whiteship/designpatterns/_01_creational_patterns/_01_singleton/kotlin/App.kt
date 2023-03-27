package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin


fun main(){
    val instance = Settings.getInstance()
    val instance2 = Settings.getInstance()
    // instance === instance2 true

    // 싱글턴을 구현해도 리플렉션, 직렬화 역직렬화로 싱글턴을 깨버릴 수 있다.. ㄸ
}