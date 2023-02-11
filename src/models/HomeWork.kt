package models

fun main() {
    print("ismingizni kiriting: ")
    val name = readLine()!!.toString()
    print("yoshingizni kiriting: ")
    val age = readLine()!!.toInt()
    print("Telefon nomeringizni kiriting: ")
    val phoneNumber = readLine()!!.toString()

    var user1 = MyData(name, age, phoneNumber)

//    val moshina = Nexia()
//    moshina.show("Nexia")

//    print("ismingizni kiriting: ")
//    val name = readLine()!!.toString()
//    print("tug'ilgan yilingizni kiriting: ")
//    val age = readLine()!!.toInt()
//    meningYoshim(name, age)
}
//task - 1
fun newFun(a: Int, b: Float): Float = a + b
fun newFun(a: Int, b: Int) = print(a + b)

//task - 2
fun isName(str: String): Boolean{
    val re  = Regex("^[a-zA-Z]*$")
    return !(str.length <= 2 || !((str != "")
            && (str.matches(re))))
}
//task - 3
fun meningYoshim(str: String, yil: Int) = if (isName(str) && yil <= 2023) {
    println("Ismingiz: $str")
    println("Yoshingiz: ${2023 - yil} da")
} else print("Ismingizni yoki yoshingizni to'g'ri kiriting")