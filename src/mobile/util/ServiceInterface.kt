package mobile.util

interface ServiceInterface {
    fun addUser()
    fun deleteUser()
    abstract fun findCompany(phoneNumber: String): String
}