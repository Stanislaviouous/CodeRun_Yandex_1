package Easy

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

/*
Проверка палиндрома
*/
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val poli = reader.readLine().lowercase(Locale.getDefault()).replace(" ", "")
    writer.write((if(poli.reversed() == poli) "It is a palindrome" else "It is not a palindrome"))
    reader.close()
    writer.close()
}