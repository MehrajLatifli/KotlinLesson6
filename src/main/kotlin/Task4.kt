import java.util.*

var functionCallCount = 0

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    Rectangle(Inputparameter(scanner), Inputparameter(scanner))
}

fun Rectangle(width: Double, length: Double) {
    Operation(width, length)
}

fun Operation(width: Double, length: Double) {
    println("\n1 <- Perimeter")
    println("2 <- Area")
    print("\nChoose operation: ")

    val scanner = Scanner(System.`in`)
    val operator = scanner.next()

    when (operator) {
        "1" -> {
            println("The perimeter of the rectangle: ${2 * (width + length)} cm")
        }
        "2" -> {
            println("The area of a rectangle: ${width * length} cm")
        }
        else -> {
            println("\nThe fallacy of choice")
        }
    }
}

fun Inputparameter(scanner: Scanner): Double {

    functionCallCount++

    if(functionCallCount==1)
    {
        print("Enter width: ")
    }
    if(functionCallCount==2)
    {
        print("Enter length: ")
    }
    else{
        functionCallCount=0
        functionCallCount++
    }


    var parameter: Double? = null
    while (parameter == null || parameter <= 0) {
        if (scanner.hasNextDouble()) {
            parameter = scanner.nextDouble()
            if (parameter <= 0) {
                println("\nPlease enter a valid parameter (positive).")

                if(functionCallCount==1)
                {
                    print("Enter width: ")
                }
                if(functionCallCount==2)
                {
                    print("Enter length: ")
                }
                else{
                    functionCallCount=0
                    functionCallCount++
                }
            }
        } else {
            println("Please enter a valid parameter.")

            if(functionCallCount==1)
            {
                print("Enter width: ")
            }
            if(functionCallCount==2)
            {
                print("Enter length: ")
            }
            else{
                functionCallCount=0
                functionCallCount++
            }
            scanner.next()
        }
    }
    return parameter
}
