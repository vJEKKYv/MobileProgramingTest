package FunctionAndValueTest

fun main(){
    fun some(data1:Int, data2: Int = 10): Int{
        return data1*data2
    }
    println(some(10))
    println(some(10, 20))
    // 함수의 변수명을 직접 호출도 가능
    println(some(data2=20, data1 = 10))
}