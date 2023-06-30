package com.lannstark.lec02

fun main() {
//    println(startsWidth(null))
    val person = Person("공부하는 개발자")
    startsWidthA(person.name)
}

fun startsWidthA(str: String): Boolean {
    return str.startsWith("A")
}
// 코틀린에서는 null 이 가능한 타입을 완전히 다르게 취급한다.
// null 이 들어올수 있음은 ? 로 표시한다
fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A")?: throw  IllegalArgumentException("null이 들어왔습니다")

    // 위에서 한번 null 체크를 해준다면 밑에서는 컴파일러에서 자동으로
    // null 이 아닌 애들을 가지고 체크를 한다.

}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false

}

fun startsWidth(str: String?): Boolean {
    return str!!.startsWith("A")
}


