package Medium

import kotlin.collections.ArrayList
import kotlin.collections.HashSet

fun main() {
    var sc = readLine().toString()
    var p = sc.split(" ")
    val N = p[0].toInt()
    val M = p[1].toInt()

    var list = ArrayList<Int>()

    var inArr = IntArray(N + 1)
    var outArr = IntArray(N + 1)
    var A = 0
    var B = 0
    var set = HashSet<String>()

    for (i in 0 until M) {
        set.add(readLine().toString())
    }

    for (i in set) {

        p = i.split(" ")
        A = p[0].toInt()
        B = p[1].toInt()
        if(A != B) {
            inArr[A] += 1
            outArr[B] += 1
        }
    }
    for (i in 1 until N + 1) {
        if (outArr[i] == N - 1 && inArr[i] == 0) {
            list.add(i)
        }
    }
    if (list.size != 1) {
        println(-1)
    } else {
        println(list[0])
    }
}