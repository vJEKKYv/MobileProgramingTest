package valueTest

//val data1: Int    //오류
val data2 = 10

fun someFun() {
    val data3: Int
    //println("data3: $data3")  //오류
    data3 = 10
    println("data3: $data3")
}

class User{
    //val data4: Int    //오류
    val data5: Int = 10
}