package oop_00000077033_stevenwan.week03

class Weapon (val name: String, initialDamage: Int) {
    var damage: Int = initialDamage
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai lama ($field) dipertahankan.")
            } else if (value > 1000) {
                println("Peringatan: Damage $value terlalu OP! Dipaksa menjadi 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}