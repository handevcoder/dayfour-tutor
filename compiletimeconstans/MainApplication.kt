package dayfour.compiletimeconstans

object ConstantObject{
    const val BASE_URL = "https://localhost:3000/"
}

class ConstantClass{
    companion object{
        const val BASE_URL ="https://online-course-todo.herokuapp.com/"
    }
}

fun main() {
    println(ConstantObject.BASE_URL)
    println(ConstantClass.BASE_URL)
}