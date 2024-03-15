package chapter5

fun hofFun(arg: (Int)->Boolean):() -> String{
    val result = if(arg(10)){
        "valid"
    } else{
        "invalid"
    }
    return {"hofFun result : $result"}
}