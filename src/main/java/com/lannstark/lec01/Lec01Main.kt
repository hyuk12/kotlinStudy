package com.lannstark.lec01

fun main() {
    // var 수정가능 val 수정불가 var 일반변수 val final 변수
    // var / val  초기값을 지정해주지 않은 경우는 타입을 명시 명시하지 않으면 오류난다
    // val 컬렉션은 element 를 추가할수 있따.

    // 팁! 모든변수는 우선 val 로 만들고 꼭 필요한 경우 var 로 만든다.

    var number1: Long = 10L //(1)
    println(number1)
    val number2 = 10L //(2)



    // null 이 들어갈수 있는
    var number3: Long? = 1_000L //(3)
    number3 = null

    // 객체인스턴스화 할때 new 를 붙이지 않는다.
    var person = Person("최해혁") //(4)
}