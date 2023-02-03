fun main() {
    print("1 va 999999999 oralig'ida son kiriting\nn=")
    var n = readLine()!!.toInt()
    print(checking(n))
}

fun checking(n: Int): String{
    var isOne: Boolean = true
    var isTen: Boolean  = false
    var isHundred: Boolean  = false
    var haveNumber: Boolean  = false

    var answer:String = ""
    val numberSize = n.toString().length
    var son = n

    if (numberSize > 9) {
        print("kiritilgan son 1 va 999999999 oralig'ida emas...")
    }else if (n == 0) {
        print("nol")
    }else
        for (i in 1..numberSize) {
            if (isOne) {
                if (haveAndNot(son % 10)){
                    answer = "${one(son % 10)}"
                    haveNumber = true
                    isOne = false
                    isTen = true
                    son /= 10
                } else{
                    isOne = false
                    isTen = true
                    son /= 10
                }
            }
            if (isTen) {
                if (haveAndNot(son % 10)){
                    answer = "${one(son % 10)} $answer"
                    haveNumber = true
                    isHundred = true
                    isTen = false
                    son /= 10
                } else{
                    isHundred = true
                    isTen = false
                    son /= 10
                }
            }
            if (isHundred) {
                if (haveAndNot(son % 10)){
                    answer = "${one(son % 10)} $answer"
                    haveNumber = true
                    isHundred = true
                    isTen = false
                    son /= 10
                } else{
                    isHundred = true
                    isTen = false
                    son /= 10
                }
            }
        }
    return answer
}

fun haveAndNot(i: Int): Boolean {
    return (i != 0)
}

fun hundred(n: Int): String {
    val result =  when(n){
        1 -> "bir "
        2 -> "ikki "
        3 -> "uch "
        4 -> "to'rt "
        5 -> "besh"
        6 -> "olti"
        7 -> "yetti"
        8 -> "sakkiz"
        else -> "to'qqiz "
    }
    return result
}

fun ten(n: Int): String {
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
    return result
}

fun one(n: Int): String {
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
    return result
}
