package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
/*

*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val onst = 64
    val part = reader.readLine().toString()
    var l = ArrayList<Int>()
    for (i in (part.indices)){
        if (part[i].code - onst > 0){
            l.add(i)
        }
    }
    var summ = 0
    for (i in (0 until  l.size - 1)){
        if (l[i + 1] - l[i] == 1) {
            summ += 1
        }
        else {
            summ += part.substring(l[i] + 1, l[i + 1]).toInt()
        }
    }
    summ += (if (part.length - l[l.size - 1] == 1) 1 else part.substring(l[l.size - 1] + 1).toInt())
    println(summ)
    reader.close()
    writer.close()
}