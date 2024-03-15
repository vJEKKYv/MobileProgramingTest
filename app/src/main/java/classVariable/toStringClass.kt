package classVariable


fun main() {
    class NonDataClass(val name: String, val email: String, val age: Int)
    data class DataClass(val name: String, val email: String, val age: Int)
    val non = NonDataClass("kkang", "a@a.com", 10)
    val data = DataClass("kkang", "a@a.com", 10)
    println("non data class toString : ${non.toString()}") //class의 주소 출력
    println("data class toString : ${data.toString()}") // data 자체 출력
}