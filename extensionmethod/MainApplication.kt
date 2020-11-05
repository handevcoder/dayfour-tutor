package dayfour.extensionmethod

fun <T> MutableList<T>.swap(first: T, second: T){
    val firstIndex = this.indexOfFirst { it == first }
    val secondIndex = this.indexOfFirst { it == second }

    val temp = this[firstIndex]

    this[firstIndex] = this[secondIndex]
    this[secondIndex] = temp

}
fun main() {
    val list = mutableListOf("1", "4", "7", "5", "2")
    list.swap("4", "2")
    println(list)

}