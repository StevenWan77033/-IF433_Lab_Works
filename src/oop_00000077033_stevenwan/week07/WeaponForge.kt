package oop_00000077033_stevenwan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            // Membuat senjata tipe EPIC dengan damage tinggi (misal: 85) dan durability 100
            val epicItem = GameItem("Excalibur Terkutuk", 85, ItemRarity.EPIC)
            return Weapon(epicItem, 100)
        }
    }
}