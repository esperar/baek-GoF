package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin


class Settings1 private constructor() {

    /**
     * 코틀린에서 동기화 블럭을 처리하는 방법은?
     * -> 자바와 마찬가지로 synchronize 키워드를 사용한다.
     * getInstance() 메소드 동기화시 사용하는 락(lock)은 인스턴스의 락인가 클래스의 락인가?
     * -> 클래스 락이다 그 이유 getInstance()는 정적메서드이기 때문에 인스턴스 레벨에서 락을 사용할 수 없다.
     * -> 인스턴스 레벨에서의 락은 인스턴스를 공유하는 여러 스레드 간에 상호 작용을 제어하는 데 사용된다.
    그 이유는?
     */

    companion object {
        @Volatile // <- main memory에서 읽고 쓰여야함을 보장 한 스레드에서 값이 변경되면 다른 스레드에도 즉시 알 수 있또록 보장함
        private var instance: Settings1? = null

        @Synchronized
        fun getInstance(): Settings1 = instance ?: Settings1()
    }
}