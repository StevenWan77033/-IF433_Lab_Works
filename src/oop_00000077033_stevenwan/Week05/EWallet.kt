package oop_00000077033_stevenwan.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp$amount via E-Wallet $accountName BERHASIL.")
            println("Sisa saldo: Rp$balance")
        } else {
            println("Pembayaran GAGAL: Saldo tidak cukup untuk akun $accountName.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Berhasil top up Rp$amount. Saldo sekarang: Rp$balance")
    }
}