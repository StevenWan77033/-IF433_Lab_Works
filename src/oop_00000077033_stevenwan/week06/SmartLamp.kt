package oop_00000077033_stevenwan.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' (ID: $id) dinyalakan. Tingkat kecerahan: 100%.")
    }

    override fun turnOff() {
        println("Lampu '$name' (ID: $id) dimatikan.")
    }
}