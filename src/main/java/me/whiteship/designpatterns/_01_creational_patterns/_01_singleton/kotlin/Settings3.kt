package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings3 private constructor() {

    /**
     * 더블 체킹 락킹이란?
     * 패턴은 싱글톤 객체를 생성하는 데 사용되는 패턴 중 하나입니다. 이름에서 알 수 있듯이,
     * 이 패턴은 두 번의 검사(Double-Checked)를 수행하여 동시성 문제를 해결합니다.
     */

    companion object {
        //@Volatile
        private var instance: Settings3? = null

        // @Synchronized
        fun getInstance(): Settings3 {
            var localInstance = instance
            if (localInstance == null) {
                // synchronized(Settings3::class) 아니 여기 환경에서는 이게 안써지네
                    localInstance = instance
                    if (localInstance == null) {
                        localInstance = Settings3()
                        instance = localInstance
                    }
            }
            return localInstance
        }
    }
}