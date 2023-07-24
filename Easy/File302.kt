package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
/*
Восстановить матрицу
*/
fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = reader.readLine().toInt()
    val matrix = ArrayList<IntArray>()
    var set = HashSet<Int>()
    for (i in (1 .. n*n)) {
        set.add(i)
    }
    for (i in (0 until n)) {
        val arr  =  reader.readLine().split(" ").map { it -> it.toInt() }.toIntArray()
        set.removeAll(arr.toSet())
        matrix.add(arr)
    }
    var setArr = set.toIntArray()
    for (i in (0 until n)){
        for (j in (0 until n)){
            if (matrix[i][j] == 0) {
                matrix[i][j] = set.first()
                set.remove(set.first())
            }
        }
    }
    for (i in matrix){
        println(i.joinToString(" "))
    }
    reader.close()
    writer.close()
}