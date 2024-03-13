package ArrayTest

fun main(){
    val data1: Array<Int> = Array(3,{0})
    // indexing 또는 set()으로 대입
    data1[0] = 10
    data1[1] = 20
    data1.set(2,30)
    //indexing 또는 get()으로 출력
    println(
        """
            array size : ${data1.size}
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """.trimIndent()

    )
}
// Array 대신 IntArray , BooleanArray, ~~~등 기초타입명을 붙인 Array를 만들 수 있다.