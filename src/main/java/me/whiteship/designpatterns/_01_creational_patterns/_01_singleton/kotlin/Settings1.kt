package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin


class Settings1 private constructor() {

    companion object {
        // @Volatile <- main memory에서 읽고 쓰여야함을 보장 한 스레드에서 값이 변경되면 다른 스레드에도 즉시 알 수 있또록 보장함 .. import가 안돼;;
        private var instance: Settings1? = null

        // @Synchronize
        fun getInstance(): Settings1 = instance ?: Settings1()
    }
}