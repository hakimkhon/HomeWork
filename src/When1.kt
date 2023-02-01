fun main() {
    print("1-7 oralig'ida son kiriting \nn=")
    val n = readLine()!!.toInt()
    val natija = when(n){
        1 -> "Dushanba"
        2 -> "Seshanba"
        3 -> "Chorshanba"
        4 -> "Payshanba"
        5 -> "Juma"
        6 -> "Shanba"
        7 -> "Yakshanba"
        else -> "Bunday kun yo'q"
//        waka_fa3bf3c4-8786-4beb-bbb5-6a00263bd3d0
    }
    print(natija)
}