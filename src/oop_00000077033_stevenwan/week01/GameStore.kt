package oop_00000077033_stevenwan.week01

fun main() {
    val gameTitle: String = "Cyberpunk 2077"
    val price: Int = 700000

    val finalPrice = calculateDiscount(price)

    displayReceipt(gameTitle, price, finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.8).toInt() // Diskon 20%
} else {
    (price * 0.9).toInt() // Diskon 10%
}

fun displayReceipt(title: String, originalPrice: Int, total: Int) {
    println("=== Struk Kasir SteamKW ===")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $total")
    println("===========================")
}
