package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
/*
Ошейники и песики
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = reader.readLine().toInt()
    val dogsNeck = reader.readLine().split(" ").map { it -> it.toInt() }
    val belts = reader.readLine().split(" ").map { it -> it.toInt() }
    var beltsClone: IntArray
    var sumUnhappy = LongArray(n)
    var f:Long = 0
    for (i in (dogsNeck.indices)) {
        beltsClone = (belts.subList(n - i, n) + belts.subList(0, n - i)).toIntArray()
        for (j in (beltsClone.indices)) {
            f += countUnhappy(dogsNeck[j], beltsClone[j])
        }
        sumUnhappy[i] = f
        f = 0
    }
    val minUn = sumUnhappy.min()
    val minIndex = sumUnhappy.indexOf(minUn) + 1
    println("$minIndex $minUn")

    reader.close()
    writer.close()
}
fun countUnhappy(neck: Int, belt: Int): Int {
    return (if ((belt < neck)) 0 else if (belt - neck <= 100) (((belt - neck) / 2).toInt()) else 30)
}