package mobile.main

import mobile.data.Abonent
import mobile.util.ServiceInterface
import mobile.util.SotringInterface

class User: ServiceInterface, SotringInterface {
    private val listUser: ArrayList<Abonent> = ArrayList()
    fun sortingType(){
        println("""
            1. by Balance
            2. by Name
            3. All
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readln()) {
            "1" -> sortByBalance()
            "2" -> sortByName()
            "3" -> allUserList()
            else ->  println("Invalid operator selected ❌")
        }
    }

    override fun addUser() {
        print("Enter phone number: +998")
        val phoneNumber = readln()
        print("Enter full name: ")
        val fullName = readln()
        print("Enter your balance: ")
        val balance = readln().toDouble()
        val userData = Abonent(fullName = fullName, phoneNumber = phoneNumber, balance = balance, company = findCompany(phoneNumber))
        if (Chekker().checkAll(userData)){
            listUser.add(userData); println("-- user added ✅ --")
        } else println("Something went wrong ❌")
    }

    override fun deleteUser() {
        var count = 0
        listUser.sortBy { it.fullName }
        listUser.forEach {
            count++
            print("$count ."); printUserInfo(it)
        }
        print("input user id to delete:") //deleted by id , fullName or phone number
        val userId = readln().toInt()
        printUserInfo(listUser[userId-1])
        listUser.removeAt(userId-1)
        println("-- user deleted ✅ --")
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
        println("""
            1. by Name
            2. by Lastname
            3. by Company
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readln()) {
            "1" -> searchByName()
            "2" -> searchByLastName()
            "3" -> searchByCompany()
            else ->  println("Invalid operator selected ❌")
        }
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

    //region Functions
    private fun printUserInfo(data: Abonent){
        println("👨 ${data.fullName},📞 ${data.phoneNumber}, 💰 ${data.balance}, 🏦 ${data.company}")
    }

    private fun formatUserName(name : String): String{
        return name.lowercase().split(" ").joinToString(separator = " ", transform = String::capitalize)
    }

    //endregion

    //region Search
    private fun searchByName(){
        print("Enter name: ")
        val name = readln()
        listUser.forEach {
            if ( it.fullName.contains(name.trim().lowercase().capitalize()))  printUserInfo(it)
        }
    }

    private fun searchByLastName(){
        print("Enter lastname: ")
        val name = readln()
        listUser.forEach {
            if (it.fullName.contains(name.trim().lowercase().capitalize()))   printUserInfo(it)
        }
    }

    private fun searchByCompany(){
        print("Enter company name: ")
        val name = readln()
        listUser.forEach {
            if ( it.company.contains(name.trim().lowercase().capitalize()))  printUserInfo(it)
        }
    }

    //endregion
}