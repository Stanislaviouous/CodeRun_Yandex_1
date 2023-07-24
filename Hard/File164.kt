package Hard

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
/*
Магическая подстрока
*/
fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val T = reader.readLine().toString()
    val S = reader.readLine().toString()
    val n = T.length
    val m = S.length
    if (m > n) {
        println(-1)
        return
    }
    val TMass = IntArray(26)
    val SMass = IntArray(26)
    val const = 97
    // Заполнение массива
    for(j in (0 until m)){
        val symbolT = T[j].code - const
        val symbolS = S[j].code - const
        SMass[symbolS] = SMass[symbolS] + 1
        TMass[symbolT] = TMass[symbolT] + 1
    }
    var mark = false
    // Сдвигаем массив TMass, тем самым ходим по строке, только курсор - целый массив
    for(i in (m until n + 1)){
        // Сравниваем два массива на магичность
        mark = isMagic(TMass, SMass)
        if (mark) {
            println(i - m)
            return
        }
        // Момент сдвига
        val symbolT = if (i != n) (T[i].code - const) else (0)
        val symbolPrevT = if (i != n) (T[i - m].code - const) else (0)
        TMass[symbolPrevT] = TMass[symbolPrevT] - 1
        TMass[symbolT] = TMass[symbolT] + 1
    }
    println(-1)
    reader.close()
    writer.close()
}

fun isMagic(TMass: IntArray, SMass: IntArray): Boolean {
    var mark = 0
    for(ch in (0 until 26)){
        mark += abs(TMass[ch] - SMass[ch])
    }
    if(mark == 2) {
        return true
    }
    return false
}