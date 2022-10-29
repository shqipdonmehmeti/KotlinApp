import kotlinClasses.Employee

fun main() {

   val employee = Employee("Bill Gates",60)
    println(employee.fullName)
    employee.fullName = "Mark"
    println(employee.fullName)
    println(employee.age)
    employee.age = 70
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
 when(value) {
  "A","B" -> println("Value is A or B")
  "C","D","E" -> println("Value is C , D or E")
  else -> println("Another value")
 }
}



