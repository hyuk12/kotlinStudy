package lec01

import com.lannstark.lec01.Person

fun main() {

    /**
     *  var 은 변경가능한 일반 변수 , val 은 수정이 불가한 final 변수(상수)
     *  var 과  val 모두 초기 값을 지정해 주지 않으면 타입을 꼭 명시 해야한다 (자바와 다른점)
     *  val 컬렉션은 element 를 추가 할 수 있다.
     *
     *
     *  팁! 모든변수는 우선 val 로 만들고 꼭 필요한 경우 var 로 만든다.
        kotlin 은 함수형 프로그래밍이기 때문에 함수안에서 실행해야 돌아간다
        아무리 많은 코드를 짜도 해당 코드가 함수에 없다면 실행 시킬 수 없다.
        그 것이 자바와 다른점.
     *
      */


    val number1: Long = 10L //(1)
    println(number1)
    val number2 = 10L //(2)



    // null 이 들어갈수 있는
    var number3: Long? = 1_000L //(3)
    number3 = null

    // 객체인스턴스화 할때 new 를 붙이지 않는다.
    var person = Person("최해혁") //(4)
}