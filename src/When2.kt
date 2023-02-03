import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("1 va 999999999 oralig'ida son kiriting\nn=")
    var n = scanner.nextInt()
    print(tekshirish(n))
}

fun tekshirish(n: Int): String{
    var javob:String = ""
    val numberSize = n.toString().length
    var son = n
    if (numberSize > 9) {
        print("kiritilgan son 1 va 999999999 oralig'ida emas...")
    }else if (n == 0) {
        print("nol")
    }else
        for (i in 1..numberSize) {
            if (i == 1) {
                javob = ones(son % 10)
                son /= 10
            }
            if (i == 2) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = tens(son % 10) + " " + javob
                    son /= 10
                }
            }
            if (i == 3) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = "${hundreds(n = son % 10)} yuz $javob"
                    son /= 10
                }
            }
            if (i == 4) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = ones(son % 10) + " ming " + javob
                    son /= 10
                }
            }
            if (i == 5) {
                javob = tens(son % 10) + " " + javob
                son /= 10
            }
            if (i == 6) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = hundreds(son % 10) + " yuz " + javob
                    son /= 10
                }
            }
            if (i == 7) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = ones(son % 10) + " million " + javob
                    son /= 10
                }
            }
            if (i == 8) {
                javob = tens(son % 10) + " " + javob
                son /= 10
            }
            if (i == 9) {
                if (son % 10 == 0) {
                    son /= 10
                    continue
                }
                else{
                    javob = hundreds(son % 10) + " yuz " + javob
                    son /= 10
                }
            }
        }
    return javob
}
fun hundreds(n: Int): String {
    val result =  when(n){
        0 -> ""
        1 -> "bir"
        2 -> "ikki"
        3 -> "uch"
        4 -> "to'rt"
        5 -> "besh"
        6 -> "olti"
        7 -> "yetti"
        8 -> "sakkiz"
        else -> "to'qqiz"
    }
    return result
}
fun tens(n: Int): String {
    val result =  when(n){
        0 -> ""
        1 -> "o'n"
        2 -> "yigirma"
        3 -> "o'ttiz"
        4 -> "qirq"
        5 -> "ellik"
        6 -> "oltmish"
        7 -> "yetmis"
        8 -> "sakson"
        else -> "to'qson"
    }
    return result
}
fun ones(n: Int): String {
    val result = when(n){
        0 -> ""
        1 -> "bir"
        2 -> "ikki"
        3 -> "uch"
        4 -> "to'rt"
        5 -> "besh"
        6 -> "olti"
        7 -> "yetti"
        8 -> "sakkiz"
        else -> "to'qqiz"
    }
    return result
}
