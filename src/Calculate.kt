import java.util.*

fun sum(a: Int, b: Int): Int = a + b
fun subtraction(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b
fun divide(a: Int, b: Int): Int = a / b

fun main() {
    val sc: Scanner = Scanner(System.`in`)

    print("Please enter the first number : ")
    val firstNum: Int = sc.nextInt()

    print("Please enter the second number : ")
    val secondNum: Int = sc.nextInt()

    println("sum : $firstNum + $secondNum = ${sum(firstNum, secondNum)}")
    println("subtraction : $firstNum - $secondNum = ${subtraction(firstNum, secondNum)}")
    println("multiply : $firstNum * $secondNum =  ${multiply(firstNum, secondNum)}")
    println("divide : $firstNum / $secondNum = ${divide(firstNum, secondNum)}")
}