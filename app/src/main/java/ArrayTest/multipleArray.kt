package ArrayTest

var two = Array<IntArray>(3,{ IntArray(4) })

fun main() {
    two[0][0] = 100
    two[2][3] = 200
}

// 코틀린은 다중 배열이 불편해서 잘 안씀.
