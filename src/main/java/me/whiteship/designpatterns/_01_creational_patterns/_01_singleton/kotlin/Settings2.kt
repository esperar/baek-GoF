package me.whiteship.designpatterns._01_creational_patterns._01_singleton.kotlin

class Settings2 private  constructor() {

    /**
     * 이른 초기화의 문제?
     * 1. 초기화 시점에서의 문제 -> 클래스가 로드될때 인스턴스를 생성한다 생성자에서 복잡한 로직을 가지고있다면 애플리케이션 성능을 하향시킨다.
     * 2. 불필요한 자원 사용 -> 인스턴스가 사용되지 않을때도 자원이 생성된다 getInstance()를 사용하기 전에도 생성되니 성능 저하를 유발한다.
     * 3. 유연성의 제한 -> 이른 초기화는 인스턴스 필드를 수정할 수 없다.
     *    따라서, 필드 값을 동적으로 변경하는 경우나 특정 조건에 따라 인스턴스를 생성해야 하는 경우 이 방법은 유연성이 제한된다.
     * 생성자에서 checked 예외를 던진다면?
     * -> 생성자에서 예외처리를 해준다.
     */
    companion object {
        private val INSTANCE: Settings2 = Settings2()

        fun getInstance() = INSTANCE
    }
}