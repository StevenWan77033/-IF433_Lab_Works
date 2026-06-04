package oop_00000077033_stevenwan.week06

fun main() {
    val lamp = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")

    val hub = SmartHomeHub()

    println("=== MENDAFTARKAN PERANGKAT ===")
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Pengujian fungsi logika inti Smart Home
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}