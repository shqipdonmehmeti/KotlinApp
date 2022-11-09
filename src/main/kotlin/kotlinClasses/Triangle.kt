package kotlinClasses

class Triangle : Shape {
    override val angles: Int = 50
//        get() = 50
    override val scale: Double = 10.0
//        get() = TODO("Not yet implemented")

    override fun draw() {
        println("This triangle is drawable!x`")
    }
}