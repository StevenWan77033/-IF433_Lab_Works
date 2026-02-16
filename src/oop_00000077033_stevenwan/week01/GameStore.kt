package oop_00000077033_stevenwan.week01

fun main() {
    val gameTitle: String = "Cyberpunk 2077"
    val price: Int = 700000

    val finalPrice = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.8).toInt() // Diskon 20%
} else {
    (price * 0.9).toInt() // Diskon 10%
}

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBAYARAN ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("========================")
}
