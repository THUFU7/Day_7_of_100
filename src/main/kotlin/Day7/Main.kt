package Day7
fun main (args: Array<String>) {
    delegate()
}
fun delegate() {
    val shark = Sharks()
    println("Sharks have a ${shark.color} color")
    shark.eat()
}
interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}
object GreyColor : FishColor {
    override val color = "Grey"
}
object YellowColor : FishColor {
    override val color = "Yellow"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
class Sharks (fishColor: FishColor = GreyColor):
    FishAction by PrintingFishAction("Eats the rest of the fish"),
    FishColor by fishColor