package lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}의 범위는 0부터 100입니다..")
    }
}
// kotlin 에서는 삼항연산자가 없다 if else 가 이것을 대체한다
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P";
    } else {
        "F";
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    }else if (score >= 80) {
        "B"
    }else {
        "C"
    }
}

// 자바에서의 switch 문은 when 으로 변경 되었다. in은 between 의 의미로 해당 범위 안에 있다면 이라는 것이다 .. 을 쓰게 되면 앞의 숫자와 뒤의 숫자 사이를 의미한다.
fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any) : Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber (number : Int) {
    when (number) {
        1, 0, -1 -> println(number)
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2 (number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}