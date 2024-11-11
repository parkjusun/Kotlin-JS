interface Clickable {    fun click(): Unit}interface Focusable {    fun focused()    fun hidden()}open class Button {    fun click(): Unit {        println("Button clicked.")    }}class Input : Button(), Focusable {    override fun focused() {        println("Input Box focused.")        internalPrint()    }    override fun hidden() {        println("Input Box hidden.")    }    private fun internalPrint(){        println("Button internalPrint1")    }}private fun internalPrint(){    println("Button internalPrint2")}fun main() {    Input().click()    Input().focused()    Input().hidden()    internalPrint()}