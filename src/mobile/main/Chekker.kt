package mobile.main

import mobile.data.Abonent
import mobile.util.ChekkerInterface

class Chekker :ChekkerInterface {
    override fun checkName(name: String): Boolean {
        return name.length > 2 && "[A-Za-z ']+".toRegex().matches(name)
    }

    override fun checkPhone(phone: String): Boolean {
        return phone.length == 9 && "[0-9+]+".toRegex().matches(phone)
    }

    override fun checkBalance(balance: Double): Boolean {
        return "[0-9.]+".toRegex().matches(balance.toString())
    }

    fun checkAll(data: Abonent) : Boolean {
        return checkName(data.fullName) && checkPhone(data.phoneNumber) && checkBalance(data.balance)
    }
}