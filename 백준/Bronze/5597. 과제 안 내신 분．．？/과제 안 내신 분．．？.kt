
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = arrayListOf<Int>()
    val findStudent = arrayListOf<Int>()
    repeat(28) {
        list.add(br.readLine().toInt())
    }
    for(i in 1..30) {
        if(i !in list) {
            findStudent.add(i)
        }
    }
    println("${findStudent[0]} ${findStudent[1]}")
}


