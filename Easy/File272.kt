package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
/*
Простая подсказка
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = reader.readLine().toString().toInt()
    var hashMap = TreeMap<Char, Int>()
    for(i in (0 until n)) {
        val command = reader.readLine()[0]
        hashMap[command] = (if (hashMap.containsKey(command)) (hashMap[command].toString().toInt() + 1) else (1))
    }
    val maxi = hashMap.values.max()
    writer.write(hashMap.filter { maxi == it.value }.keys.first().toString())
    reader.close()
    writer.close()
}