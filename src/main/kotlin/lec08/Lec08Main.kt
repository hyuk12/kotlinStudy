package lec08

fun main() {
    // 내가 원하는 매개변수에 넣고 싶을 때 namedArguments 라고 아래 처럼 쓸 수 있다.
    repeat("Hello world", useNewLine =  false)
    // 빌더를 쓰지 않지만 빌더처럼 쓸 수 있다.
    // 하지만 자바 함수를 가져다 쓸 때는 namedArgument 를 쓸 수 없다. 컴파일단에서 불가능하다.
    printNameAndGender(gender = "FEMALE", name = "Zephyr")
    printAll("A", "B", "C", "D", "E", "F")

    val array = arrayOf("A", "B", "C", "D", "E", "F")
    // * 스프레드 연산자를 써주어야 한다.
    printAll(*array)
}

// public 은 생략가능하다.
// 함수의 결과값이 하나라면 = 이 가능하다.
fun max(a: Int, b: Int) = if (a > b)  a  else  b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll (vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
