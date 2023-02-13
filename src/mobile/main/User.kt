package mobile.main

import mobile.data.Abonent
import mobile.util.ServiceInterface
import mobile.util.SotringInterface

class User: ServiceInterface, SotringInterface {
    fun sortingType(){
        println("""
            1. by Balance
            2. by Name
            3. All
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readLine()) {
            "1" -> sortByBalance()
            "2" -> sortByName()
            "3" -> allUserList()
            else ->  println("Invalid operator selected ❌")
        }
    }

    override fun addUser() {
        print("Enter phone number: +998")
        val phoneNumber = readLine()
        print("Enter full name: ")
        val fullName = readLine()
        print("Enter your balance: ")
        val balance = readLine()!!.toDouble()
        val userData = Abonent(fullName = fullName!!, phoneNumber = phoneNumber!!, balance = balance, company = findCompany(phoneNumber))
    }

    override fun deleteUser() {
        TODO("Not yet implemented")
    }

    override fun findCompany(phoneNumber: String): String {
        var result: String = ""
        if (phoneNumber.startsWith("93") || phoneNumber.startsWith("94")) result = "UCELL"
        else if (phoneNumber.startsWith("90") || phoneNumber.startsWith("91")) result = "BEELINE"
        else if (phoneNumber.startsWith("95") || phoneNumber.startsWith("99")) result = "UZMOBILE"
        else if (phoneNumber.startsWith("97") || phoneNumber.startsWith("88")) result = "MOBIUZ"
        return result
    }

    override fun searchUser() {
        TODO("Not yet implemented")
    }

    override fun allUserList() {
        TODO("Not yet implemented")
    }

    override fun sortByName() {
        TODO("Not yet implemented")
    }

    override fun sortByBalance() {
        TODO("Not yet implemented")
    }
}