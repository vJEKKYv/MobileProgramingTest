package classConstructor
/**
open class Super{
    open var superData = 10
    open fun superFun() {
        println("i am superFun : $superData")
    }
}

class Sub: Super(){
    override var superData = 20
    override fun superFun() {
        println("i am sub class funtion: $superData")
    }
}

fun main(){
    val obj = Sub()
    obj.superFun()
}
        **/