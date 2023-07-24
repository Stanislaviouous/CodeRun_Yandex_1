package Medium

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/*
Поворот /TODO
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val a = reader.readLine().split(" ")
    val str = reader.readLine().toString()
    val n = a[0].toInt()
    val m = len(str)
    var k = (a[1].toLong() % m)
    val konst = 64



    reader.close()
    writer.close()
}
// Функция подсчёта длинны
fun len(strin: String): Int {
    var l = ArrayList<Int>()
    for (i in (strin.indices)){
        if (strin[i].code - 64 > 0){
            l.add(i)
        }
    }
    var summ = 0
    summ += (if (l.first() == 0) 1 else strin.substring(0, l[0]).toInt())
    for (i in (0 until  l.size - 1)){
        if (l[i + 1] - l[i] == 1) {
            summ += 1
        }
        else {
            summ += strin.substring(l[i] + 1, l[i + 1]).toInt()
        }
    }
    return summ
}


// Неэкономичное рец
//import java.io.BufferedWriter
//import java.io.InputStreamReader
//import java.io.OutputStreamWriter
///*
//Поворот
//*/
//fun main(args: Array<String>) {
//    val reader = BufferedReader(InputStreamReader(System.`in`))
//    val writer = BufferedWriter(OutputStreamWriter(System.out))
//
//    val a = reader.readLine().split(" ")
//    val str = reader.readLine().toString()
//
//    val n = a[0].toInt()
//    var k = (a[1].toLong())
//    val konst = 64
//    var lim = ArrayList<String>()
//    var stroke = ""
//    var count = "0"
//    for (i in (str.indices)) {
//        if (str[i].code > konst) {
//            stroke += (if (count == "0") str[i].toString() else (str[i].toString().repeat(count.toInt())))
//            count = "0"
//        }
//        else {
//            if (count == "0") {
//                count = str[i].toString()
//            }
//            else {
//                count += str[i].toString()
//            }
//        }
//    }
//    val v = stroke.length
//    k = (k % v.toLong())
//    stroke = (stroke.substring(k.toInt(), v) + stroke.substring(0, k.toInt()))
//
//
//
////    println(stroke)
//    println(encode(stroke))
//    reader.close()
//    writer.close()
//}
//
//fun encode(str: String): String? {
//    var encoding = ""
//    if (str == null) {
//        return encoding
//    }
//    var count: Int
//    var i = 0
//    while (i < str.length) {
//        count = 1
//        while (i + 1 < str.length && str[i] == str[i + 1]) {
//            count++
//            i++
//        }
//        encoding += (if (count == 1) str[i] else (count.toString() + str[i]))
//        i++
//    }
//    return encoding
//}