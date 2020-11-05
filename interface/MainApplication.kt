package dayfour.`interface`

interface UserRepository{
    val name: String
    fun getAllUser(){
        println("Getting all user...")
    }
}
class UserRepositoryDatabase: UserRepository{
    override val name: String get() = "User from DB"
    override fun getAllUser(){

    }
}

class UserRepositoryRemote: UserRepository{
    override val name: String
        get() = TODO("Not yet implemented")
        //sqlite (Room/SQLiteOpenHelper)

    override fun getAllUser() {
        //HTTP Client(Retrofit, Fan, Volley dan Http
    }
}
fun main() {
    val user: UserRepository = UserRepositoryDatabase()
    user.name
    user.getAllUser()
}
