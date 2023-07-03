package lec06


fun main () {
    val numbers = listOf(1L, 2L, 3L)
    // for - each 에서 : 대신 in 을 쓴다
    // downTo 와 step 은 중위 함수이다. .. 은 등차수열을 생성한다.
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    var i = 1;
    while(i < 4) {
        println(i)
        i++
    }
}