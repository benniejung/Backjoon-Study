import java.io.*
import java.lang.StringBuilder
import java.util.*


fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))){
    var N:Int?
    val X:Int?

    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    X = st.nextToken().toInt()

    val sb = StringBuilder()
    val token = StringTokenizer(readLine(), " ")
    while(token.hasMoreTokens()) {
        val n = token.nextToken().toInt()
        if(n < X) sb.append(n).append(" ")
    }
    println(sb)

}