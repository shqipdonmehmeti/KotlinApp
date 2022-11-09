package kotlinClasses

fun main() {
    increaseByTwo()
}

fun increaseByTwo() {
    val intArray = IntArray(10) { i -> i * 2 }
    println(intArray.joinToString())
}


fun averageArrayFinder() : Double {
    val testArray = doubleArrayOf(5.5,3.8,6.7,4.2,10.15)
    return testArray.average()
}

fun isEvenNumber(number : Int) : Boolean = number % 2 == 0


fun oddNumbersFrom100to1000() {
    for (n in 100..1000) {
        if (n % 2 != 0) {
            if (n.toString().contains("0")
                || n.toString().contains("2")
                || n.toString().contains("4")
                || n.toString().contains("6")
                || n.toString().contains("8")) {
                println(n)
            }
        }
    }
}

fun replaceWordsCurrentValueWithNewValue() {
    val value = "He is crying very loudly"
    println("Shkruaj vleren e vjeter: ")
    val oldValue = readln()
    println("Shkruaj vleren e re: ")
    val newValue = readln()
    println(value.replace(oldValue,newValue))
}

fun printNumberFromTenToOne() {
    for (n in 10 downTo 1) {
        println(n)
    }
}

