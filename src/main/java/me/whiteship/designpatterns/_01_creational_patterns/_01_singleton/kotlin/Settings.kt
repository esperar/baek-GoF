package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings private constructor() {

    /**
     * 생성자를 private으로 만든 이유?
     * - 클래스 외부에서 인스턴스를 생성하지 못하게 한다
     * getInstance()를 static(companion object)으로 선언한 이유?
     * - 전역으로 설정함으로써 어디서든 이 인스턴스로 접근할 수 있음 인스턴스를 생성하지 않아도 접근 가능함
     * getInstance()가 멀티 스레드환경에서 위험한 이유?
     * - 멀티 스레드 환경에서 getInstance를 사용한다면 서로 다른 인스턴스가 생길 수 있음
     */
    companion object {
        private var instance: Settings? = null

        fun getInstance(): Settings = instance ?: Settings()

    }

}