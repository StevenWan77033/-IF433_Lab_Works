package oop_00000077033_stevenwan.Week05

fun main() {
    val myWallet = EWallet("Dana John", 50000.0)
    val myCard = CreditCard("Visa John", 100000.0)
    val daftarPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    println("=== PROSES TRANSAKSI RP 75.000 ===")

    for (metode in daftarPembayaran) {
        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("-> [Recovery] Saldo E-Wallet mungkin kurang. Melakukan top up otomatis...")

            metode.topUp(50000.0)

            println("-> Mencoba pembayaran ulang...")
            metode.processPayment(75000.0)
        }

        println("-----------------------------------")
    }
}

