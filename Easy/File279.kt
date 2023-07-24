package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = reader.readLine().toInt()
    val g: MutableList<Int> = ArrayList(n)
    val d = ArrayDeque<Int>(n)
    val s = reader.readLine().split(" ".toRegex()).toTypedArray()
    for (i in 0 until n) {
        g.add(s[i].toInt())
    }
    g.sort()
    d.addAll(g)
    val m = reader.readLine().toInt()
    val mas = Array(m) { IntArray(2) }
    for (i in 0 until m) {
        val str = reader.readLine().split(" ".toRegex()).toTypedArray()
        mas[i][0] = str[0].toInt()
        mas[i][1] = str[1].toInt()
    }

    Arrays.sort(mas, Comparator.comparingInt { o: IntArray -> o[0] })
    var j = m - 1
    while (true) {
        if (d.isEmpty()) {
            println("Yes")
            break
        }
        val el = d.last()
        if (j < 0) {
            println("No")
            break
        }
        if (mas[j][0] >= el) {
            mas[j][1] = mas[j][1] - 1
            d.removeLast()
        } else {
            println("No")
            break
        }
        if (mas[j][1] == 0) {
            j--
        }
    }

    reader.close()
    writer.close()
}