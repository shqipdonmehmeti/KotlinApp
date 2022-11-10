package kotlinClasses

class CallMainFromClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        val nums = RandomCollections(listOf(1,2,3,4,5))
            for (n in 0 until nums.length()) {
                println(nums.get(n))
            }
        }

    }
}