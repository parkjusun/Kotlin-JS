// 1. constructor 주입방식
class UserConstructor(_usrename: String, _age: Int = 20) {
    val username: String
    var age: Int = 20

    init {
        username = _usrename
        age = _age
    }
}

// 2. constructor 간소화 1단계
class UserSimplify(_usreName: String, _age: Int = 20) {
    val username: String = _usreName
    val age: Int = _age
}

//3. constructor 간소화 2단계
class UserMoreUserSimplify(
    val userName: String,
    val age: Int = 20
)


fun main() {

    val constructor = UserConstructor("John Doe")
    println("userName:${constructor.username}, age:${constructor.age}")

    val userSimplify = UserSimplify("Zendaya Maree", 29)
    println("userName:${userSimplify.username}, age:${userSimplify.age}")

    val userMoreSimplify = UserMoreUserSimplify("Tom Holland ", 24)
    println("userName:${userMoreSimplify.userName}, age:${userMoreSimplify.age}")

}

