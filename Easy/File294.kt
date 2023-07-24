import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
/*
Сумма различных
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val n = reader.readLine()
    val str = reader.readLine().split(" ").map { p -> p.toInt() }
    println(HashSet<Int>(str).sum())
    reader.close()
    writer.close()

}