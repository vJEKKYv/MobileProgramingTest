package chapter5
/**
 * //아래의 두가지는 모양만 다를 뿐 같은 형식이다. 함수로 표현된 것을 화살표로 간단하게 쓴느 것이 람다 함수.
fun sum(no1:Int, no2:Int):Int{return no1+no2}
val sum = {no1:Int, no2: Int -> no1+no2}
        **/

fun main(){
    //아래 두개는 같은 것. 형태가 다른 람다함수.
    //val some = {no: Int -> println(no)}
    val some: (Int) -> Unit = {println(it)}
    some(10)
}