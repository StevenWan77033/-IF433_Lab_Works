package oop_00000077033_stevenwan.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker '$name' aktif. Google Assistant siap menerima perintah.")
    }

    override fun turnOff() {
        println("Smart Speaker '$name' masuk ke mode standby/mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}