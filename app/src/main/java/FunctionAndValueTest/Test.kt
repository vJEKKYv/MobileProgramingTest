package FunctionAndValueTest

import android.support.v4.os.IResultReceiver._Parcel
/***
val a1: Byte = 0b00001011
val a2: Int = 123
val a3: Short = 123
val a4: Long = 10L
val a5: Double = 10.0
val a6: Float = 10.0F
val a7: Boolean = true
***/

 /***
fun main() {
    val str1 = "Hello \n World"
    val str2 = """
        Hello
        World
    """
    println("str1: $str1")
    println("str2: $str2")
}
  ***/
fun main(){
    fun sum(no: Int): Int {
        var sum = 0
        for(i in 1..no){
            sum+= i
        }
        return sum
    }

     val name: String = "KKang"
     println("name: $name, sum: ${sum(10)}, plus: ${(10+20)}")
}