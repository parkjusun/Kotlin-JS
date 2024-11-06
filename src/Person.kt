import java.util.*import kotlin.math.powclass Person(val name: String, val height: Float, val weight: Float)fun bmiLevel(width: Float, height: Float): Double = width / (height * 0.01).pow(2)fun bmiString(bmiLevel: Double): String = when {    bmiLevel < 18.5 -> "underweight"    bmiLevel < 23.0 -> "normal weight"    bmiLevel < 25.0 -> "overweight"    bmiLevel < 30.0 -> "stage 1 obesity"    bmiLevel < 35.0 -> "stage 2 obesity"    else -> "stage 3 obesity"}fun main() {    val sc: Scanner = Scanner(System.`in`)    print("what is your name?")    val inputName: String = sc.nextLine()    print("What is your height?")    val inputHeight: Float = sc.nextFloat()    print("What is your weight?")    val inputWeight: Float = sc.nextFloat()    val person = Person(inputName, inputHeight, inputWeight)    val bmi = bmiLevel(person.weight, person.height)    val bmiText = bmiString(bmi)    println("you are bmi level : $bmi")    println("you are bmi name : $bmiText")}