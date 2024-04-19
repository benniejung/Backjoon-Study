import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer



fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val st = StringTokenizer(readLine(), " ")
    val a :Int = st.nextToken().toInt()
    val b :Int = st.nextToken().toInt()


    val cal={a:Int, b:Int -> (a+b)*(a-b)}
    val result = cal(a,b)
    println(result)
}