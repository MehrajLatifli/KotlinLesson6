import java.util.*

fun main(args:Array<String> ) {

    SpeedingFines(InputSpeed())
}

fun InputSpeed():Double{

    var scanner = Scanner(System.`in`)
    print("Enter speed (km/h): ")


    var speed: Double? = null
    while (speed == null || speed <= 0) {
        if (scanner.hasNextDouble()) {
            speed = scanner.nextDouble()
            if (speed <= 0) {
                println("\nPlease enter a valid speed (positive).")
                print("Enter speed (km/h): ")
            }
        } else {
            println("Please enter a valid speed.")
            print("Enter speed (km/h): ")
            scanner.next()
        }
    }


    return speed
}


fun SpeedingFines(kilometerPerHour:Double){


    when (kilometerPerHour) {

        in 10.0..20.0 -> {
            println("Speeding fines: ${10} AZN")
        }
        in 20.0..40.0 -> {
            println("Speeding fines: ${50} AZN, ${2} points")
        }
        in 40.0..60.0 -> {
            println("Speeding fines: ${150} AZN, ${3} points")
        }
        else -> {
            if (kilometerPerHour > 60.0) {
                println("Speeding fine: ${250} AZN, ${4} points")
            } else {
                println("\nThe fallacy of choice")
            }
        }
    }
}