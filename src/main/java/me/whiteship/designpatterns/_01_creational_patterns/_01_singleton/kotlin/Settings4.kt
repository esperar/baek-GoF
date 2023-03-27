package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin



class Settings4 private constructor() {
    private object Settings4Holder {
        val INSTANCE = Settings4()
    }

    companion object {
        @JvmStatic
        fun getInstance(): Settings4 = Settings4Holder.INSTANCE
    }

    protected fun readResolve() = getInstance() // 역 직렬화 대응
}