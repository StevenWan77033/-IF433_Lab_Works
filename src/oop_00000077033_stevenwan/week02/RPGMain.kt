package oop_00000077033_stevenwan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100

    // Main Loop
    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- STATUS ---")
        println("${hero.name} (HP: ${hero.hp}) VS Enemy (HP: $enemyHp)")
        println("1. Serang\n2. Kabur")
        print("Pilih Aksi: ")

        when (scanner.nextInt()) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                println("HP Musuh berkurang! Sisa: ${if (enemyHp < 0) 0 else enemyHp}")

                if (enemyHp > 0) {
                    val monsterDamage = (10..20).random()
                    println("Musuh membalas! Kamu terkena $monsterDamage damage.")
                    hero.takeDamage(monsterDamage)
                }
            }
            2 -> {
                println("Kamu kabur dari pertarungan!")
                break
            }
        }
    }

    println("\n--- GAME OVER ---")
    if (enemyHp <= 0) {
        println("Selamat! ${hero.name} berhasil mengalahkan musuh!")
    } else if (!hero.isAlive()) {
        println("Sayang sekali, ${hero.name} telah gugur...")
    }
}