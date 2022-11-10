package kotlinClasses

class RandomCollections<T>(val items : List<T>) {
    fun get(index : Int) : T  = items[index]
    fun length() : Int  = items.size
}