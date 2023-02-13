package mobile

import mobile.data.Abonent
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    println("Bugungi sana: ${today()}")
    println("☆O'zbekiston mobil aloqa operatori☆")
    val lists = mutableListOf<Abonent>()
//    lists.add(Abonent("Hakimxon Sharifxonov", "935675520", 1.5f))
//    lists.add(Abonent("Nozim Allayev", "905542004", 1.8f))
//    lists.add(Abonent("Umarxon Usmonov", "998895511", 1.2f))
//    println(lists)
    showMenu()
}


fun showMenu(){
    print("""
        1 - Abonentlar ro'yhati
        2 - Abonent qo'shish
        3 - Abonent o'chirish
        4 - Abonent qidirish
        Tanlash -> 
    """.trimIndent())
    when(readLine()!!.toInt()){
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
    when(readLine()!!.toInt()){
        1 -> abonentlar(1)
        2 -> abonentlar(2)
        3 -> abonentlar(3)
        4 -> abonentlar(4)
        5 -> abonentlar(5)
    }
}

fun abonentlar(i: Int) {
    if (i == 5) {
        for (a in listOf<Abonent>()) {
            print(a)
        }
        println("i == 5")
    }
}

fun today(): String {
    val formatterWithTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val time = LocalDateTime.now().format(formatter)
    return time.toString()
}
