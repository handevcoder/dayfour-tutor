package dayfour.lateinit

lateinit var app: String
var appName = ""

fun main() {
    app = "My Application"
    appName = app
    print(app)
}