import kotlinClasses.Employee
import kotlinClasses.lastDigit
import java.util.*

fun main() {
val numberToTest = 567
 println(numberToTest.lastDigit())
}


fun String.getFirstAndLastCharacter() : String {
  val firstCharacter = this.first()
 val lastCharacter = this.last()
 return "".plus(firstCharacter).plus(lastCharacter)
}


//fun getFirstAndLastCharacter(value : String) : String {
// val firstCharacter = value.first()
// val lastCharacter = value.last()
// return "".plus(firstCharacter).plus(lastCharacter)
//}
fun createArrayOfFiveElements() {
 val numbers = arrayOf(10,20,30,40,50)
 println(numbers.joinToString())
}

fun createArrayUntil100() {
 val numbers = IntArray(100)
 numbers[0] = 1
 numbers[9] = 10
 numbers[99] = 100
 println(numbers.joinToString(" -> "))
}
fun sumOptionOne (a : Int , b : Int , c : Int) = a + b + c // using single expression functions

fun sumOptionTwo (a : Int , b : Int , c : Int) : Int { // using normal fun
 return a + b + c
}

fun concatStringsOptionOne (s1 : String , s2 : String) = s1.plus(s2) // using single expression functions

fun concatStringsOptionTwo (s1 : String , s2 : String ) : String { // using normal fun
 return s1.plus(s2)
}

fun isVowelOptionOne (charValue : Char) : Boolean { // long way
 if (charValue == 'a' || charValue == 'e' || charValue == 'i'
  || charValue == 'o' || charValue == 'u' || charValue == 'y') return true
 else return false
}

fun isVowelOptionTwo (charValue : Char) : Boolean { // short way
 return (charValue == 'a' || charValue == 'e' || charValue == 'i'
         || charValue == 'o' || charValue == 'u' || charValue == 'y')
}

fun printWithIfExpression (firstValue : Int , secondValue : Int) : Int { // remember if expression
  val biggerValue = if (firstValue >= secondValue) {
   println("First Value is bigger or equal")
   firstValue
  } else {
   println("First Value is bigger ")
   secondValue
  }
 return biggerValue
}

fun printWithWhenExpression (value : String) {
 when (value) {
  "A", "B" -> println("Value is A or B")
  "C", "D", "E" -> println("Value is C , D or E")
  else -> println("Another value")
 }
}

 fun showFirstAndLastCharacter() {
  val scanner = Scanner(System.`in`)
  println("Ju lutem shkruani fjaline")
  val fjalia = scanner.nextLine()


  if (fjalia[0].isLowerCase() && fjalia[fjalia.length - 1].isDigit()) {
   println("fillon me te vogel dhe mbaron me numer")
  } else {
   println("nuk plotesohet kushti")
  }
 }








