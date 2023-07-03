package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import lec07.FilePrinter as FilePrinter

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    }catch (e: NumberFormatException) {
        // new 를 써서 생성하지 않는다.
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    }catch (e: NumberFormatException) {
        null
    }
}
// 코틀린에서는 checkedException 과 UncheckedException 을 구분하지 않는다 모두 UncheckedException 으로 간주한다.
// 그래서 try catch 를 쓰거나 throws Exception 을 해줄 필요가 없다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun main () {
    readFile()
    val printer = FilePrinter()
    printer.readFile("./a.txt");
}