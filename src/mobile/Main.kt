package mobile

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

//class Operator{
//    var sc: Scanner = Scanner(System.`in`)
//    var list: List<Abonent> = ArrayList<Abonent>()
//
//    var tanlash = 0
//    var soniUsel = 0
//    var soniBeeline = 0
//    var soniUzmobile = 0
//}
fun main() {
    println("Bugungi sana: ${today()}")
    println("☆O'zbekiston mobil aloqa operatori☆")
    showMenu()
    val usell = Abonent("Umar", "986665566", 45f, "Uselll")
}

fun showMenu(){
    print("""
        1 - Abonentlar ro'yhati
        2 - Abonent qo'shish
        3 - Abonent o'chirish
        4 - Abonent qidirish
        Tanlash -> 
    """.trimIndent())
    val choose =  readLine()!!.toInt()
    when(choose){
        1 -> showMenuOperator()
        2 -> {
            println("bir")
        }
        3 -> {
            println("bir")
        }
    }
}

fun showMenuOperator() {
    print("""
        1 - USELL
        2 - BEELINE
        3 - UZMOBILE
        4 - MOBIUZ
        5 - BARCHASINI KO'RISH
        6 - ORQAGA
        Tanlash -> 
    """.trimIndent())
    val choose =  readLine()!!.toInt()
    when(choose){
        1 -> abonentlar(1)
        2 -> abonentlar(2)
        3 -> abonentlar(3)
    }
}

fun abonentlar(i: Int) {

}

fun today(): String {
    val formatterWithTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val time = LocalDateTime.now().format(formatter)
    return time.toString()
}
