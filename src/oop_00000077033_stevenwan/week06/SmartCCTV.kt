package oop_00000077033_stevenwan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("SmartCCTV '$name' (ID: $id) menyala aktif.")
        startRecord() // Memanggil otomatis saat dinyalakan
    }

    override fun turnOff() {
        println("SmartCCTV '$name' (ID: $id) dimatikan.")
    }

    override fun startRecord() {
        println("SmartCCTV '$name': Memulai proses perekaman video...")
    }
}