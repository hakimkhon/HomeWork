fun main() {
    print("1-999 oralig'ida son kiriting\nn=")
    var n = readLine()!!.toInt()
    if (n.toString().length > 3)
        print("kiritilgan son 1-999 oralig'ida emas...")
    else{
        tekshirish(n)
    }
    n %= 10
    ones(n)
    tens(n)
    hundreds(n)

}

fun tekshirish(n: Int): Int {
    val numberSize = n.toString().length
    if (numberSize > 3) {
        print("kiritilgan son 1-999 oralig'ida emas...")
        return -1
    }
    else{
        for (i in 0 until numberSize)
            print("kiritilgan son 1-999 oralig'ida emas...")
    }
    return n
}

fun hundreds(n: Int) {
    val result =  when(n){
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
    print(result)

}
fun tens(n: Int) {
    val result =  when(n){
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
    print(result)
}
fun ones(n: Int) {
    val result = when(n){
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
    print(result)
}
