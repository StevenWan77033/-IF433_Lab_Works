package oop_00000077033_stevenwan.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Rp$amount via Kartu Kredit $accountName BERHASIL.")
            println("Sisa limit tersedia: Rp${limit - usedAmount}")
        } else {
            println("Pembayaran GAGAL: Transaksi ditolak (Melebihi limit) untuk akun $accountName.")
        }
    }
}