package classConstructor

abstract class Animal {
    var name: String = ""
    abstract fun move()
}
class Tiger: Animal(){  //Animal에 괄호를 붙이는 이유는 주 생성자로 Animal을 사용한다는뜻.
    var age: Int = 0
    override fun move() {
        println("네 발로 이동한다. ")
    }
}
class Eagle: Animal(){
    var home: String = ""
    override fun move() {
        println("날개로 날아간다")
    }
}
interface iAnimal{
    abstract fun eat()
}
class iCat: iAnimal{
    override fun eat() {
        println("생선을 좋아한다")
    }
}
class iTiger:Animal(), iAnimal{
    override fun move() {
        println("네 발로 이동한다. ")
    }

    override fun eat() {
        println("멧돼지를 잡아먹는다. ")
    }
}
fun main(){
    println(" < 추상객체를 이용한 다형성 구현 > ")
    var animal: Animal

    animal = Tiger()
    animal.move()

    animal = Eagle()
    animal.move()
    println(" < interface를 이용한 다중추상객체 구현 >")

    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()
}
