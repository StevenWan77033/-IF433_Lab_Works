package oop_00000077033_stevenwan.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    // Instansiasi ApiParser
    val parser = ApiParser()

    println("=== START PROCESSING BATCH DATA ===")

    // Iterasi for
    for (raw in rawApiData) {
        try {
            // Blok try-catch untuk membungkus pemanggilan parseProduct
            val product = parser.parseProduct(raw)

            // Jika sukses dan tidak me-return null, panggil checkout()
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Log Peringatan: ${e.message}")
        }
    }
}