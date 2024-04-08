import kotlin.random.Random

fun main(args:Array<String> ) {


    println("${randomNumber()}")
}

fun randomNumber():String{

    val randomNumber = Random.nextInt(1, 101)
    println("Random number: $randomNumber")


    if(randomNumber%2==0) {

        return "Even number"
    }
    else{
        return "Odd number"
    }
}