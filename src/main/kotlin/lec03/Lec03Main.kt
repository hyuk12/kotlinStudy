package lec03

import com.lannstark.lec03.Person

// 자바에서는 암묵적으로 형변환이 가능했지만 코틀린에서는 명시적으로 표시를 꼭 해줘야 타입이 변환 가능하다.
// 예를 들어 int 인 정수가 Long 에 바로 들어갈 수 있는 경우 . 코틀린에선 불가능 하다. 무조건 명시해주어야 한다.
fun main () {
    val str1 = "ABC"
    println(str1[1])
    println(str1[2])

    val name = "최해혁"
    var str = """
        ABC
        DEF
        GHI
        JKL
        MNO
        PQR
        ${name}
    """.trimIndent()
    println(str)

    val person = Person("최해혁", 31)
    println("이름: ${person.name}")
    printAgeIfPerson(Person("", 100))
//    val number1 = 3
//    val number2: Long = number1.toLong()

//    val number1: Int ? = 3
//    val number2: Long = number1?.toLong() ?: 0L
}

// java 에서 instance of 가 is 와 같다 코틀린에서
fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        // 밑의 코드는 as Person 을 생략 가능하다 바로 obj.age 가능하다.
        val person = obj as? Person
        println(person?.age)
    }
}

// Any -> java 의 Object 역할 (모든 객체의 최상위 타입)
// 모든 Primitive Type 의 최상의 타입도 Any 이다
// Any 자체로는 null 을 포함 할 수 없어 null 을  포함하고 싶다면,  Any? 로 표시
// Any 에 equals/ hashCode / toString 존재.

// Unit 은 Java 의 void 와 동일
// void 와 다르게 Unit 은 그 자체로 타입 인자로 사용가능
// 함수형 프로그래밍에서 Unit 은 단하나의 인스턴스만 가진다는 의미

// Nothing 함수가 정상적으로 끝나진 않는 함수에 적는다