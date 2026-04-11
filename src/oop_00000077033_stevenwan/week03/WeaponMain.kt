package oop_00000077033_stevenwan.week03

fun main() {
    val sword = Weapon("Excalibur", 500)
    println("Senjata: ${sword.name} | Damage Awal: ${sword.damage}")

    sword.damage = -50
    println("Setelah set -50: ${sword.damage}")

    sword.damage = 9999
    println("Setelah set 9999: ${sword.damage}")

    println("Tier Senjata: ${sword.tier}")
}
