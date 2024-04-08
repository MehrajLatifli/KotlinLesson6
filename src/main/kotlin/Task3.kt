import java.util.*

fun main(args:Array<String> ) {


  println("Fahrenheit: ${CelsiusToFahrenheit(InputCelsius())} °F")
}

fun CelsiusToFahrenheit (celsius: Double):Double{

    var fahrenheit = celsius * 9 / 5 + 32

    return  fahrenheit
}

fun InputCelsius():Double{

    var scanner = Scanner(System.`in`)
    print("Enter celsius (℃): ")


    var celsius: Double? = null
    while (celsius == null || celsius <= 0) {
        if (scanner.hasNextDouble()) {
            celsius = scanner.nextDouble()
        } else {
            println("Please enter a valid celsius.")
            print("Enter celsius (℃): ")
            scanner.next()
        }
    }


    return celsius
}