package kotlinClasses

class Employee (var fullName : String) {
    var age : Int = 0
       // get() = field * 2 this is short way for get
       get() {
           return field * 2
       }
        set(value) {
            field = value
        }
    constructor(fullName: String ,  age : Int) : this(fullName) {
        this.age = age
    }

}