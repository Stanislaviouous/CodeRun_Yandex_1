package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
/*
Самая сложная буква
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = reader.readLine().toString().toInt()
    val str = reader.readLine().toString()
    val AMass =  reader.readLine().split(" ").map { it -> it.toInt() }.toIntArray()
    val cMass = IntArray(AMass.size)
    cMass[0] = AMass[0]
    for ( i in (1 until n)) {
        cMass[i] = AMass[i] - AMass[i - 1]
    }
    val maxi = cMass.max()
    for (i in (cMass.size - 1 downTo 0)) {
        if (cMass[i] == maxi) {
            println(str[i])
            return
        }
    }
    reader.close()
    writer.close()
}