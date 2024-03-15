package classConstructor
/**
open class Super{
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}
class Sub: Super(){
    fun subFun() {
        publicData++
        protectedData++
        //privateData++ // <- private 데이터이기에 오류 발생
    }
}
fun main(){
    val obj = Super()
    obj.publicData++
        /** 두가지 경우 protected는 상속된 클래스에서만 사용 가능하고
         * private는 해당 클래스 내에서만 가능하기에 오류 발생.
    obj.protectedData++
    obj.privateData++
        **/
}
        **/