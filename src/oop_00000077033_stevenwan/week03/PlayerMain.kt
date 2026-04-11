package oop_00000077033_stevenwan.week03

fun main() {
    val player = Player("Tepens")


    println("Username: ${player.username} | Level Awal: ${player.level}")

    player.addXp(50)
    println("Setelah +50 XP, Level: ${player.level}")

    player.addXp(60)
    println("Setelah +60 XP, Level: ${player.level}")
}