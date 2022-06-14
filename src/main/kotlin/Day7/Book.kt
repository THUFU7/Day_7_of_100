package Day7
abstract class BookFish{
    abstract val color: String
}
class Shark: BookFish(), FishAction{
    override val color = "Gray"
    override  fun eat(){
        println("Hunt and eat fish")
    }
}
class Whales: BookFish(), FishAction{
    override val color = "Blue"
    override  fun eat(){
        println("Sing and eat planks")
    }
}

