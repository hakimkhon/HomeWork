package mobile

class Abonent(val ismi: String, val telNomer: String, val balans: Float) {

    constructor(operator: String){}

    fun printResult(){
//        println("$ismi - $telNomer -> $balans | $operator")
    }
}


//    fun operator(): String{
//        var result = ""
//        if (telNomer.startsWith("93") || telNomer.startsWith("94")) result = "Usel"
//        else if (telNomer.startsWith("90") || telNomer.startsWith("91")) result = "Beeline"
//        else if (telNomer.startsWith("99") || telNomer.startsWith("95")) result = "Uzmobile"
//        else if (telNomer.startsWith("97") || telNomer.startsWith("88")) result = "Mobiuz"
//        return result
//    }
