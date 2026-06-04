package oop_00000077033_stevenwan.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Awas! Monster ${event.monsterName} muncul menghadangmu!")
        }
        is LootDropped -> {
            // Memanfaatkan properti dari data class GameItem di dalamnya
            println("Selamat! Kamu mendapatkan item: ${event.item.name} [Rarity: ${event.item.rarity}] dengan damage ${event.item.damage}.")
        }
        is GameOver -> {
            println("Permainan Berakhir! Alasan: ${event.reason}")
        }
        SafeZone -> {
            println("Kamu memasuki Safe Zone. Area aman dari monster.")
        }
    }
}