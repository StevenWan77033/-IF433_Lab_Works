package oop_00000077033_stevenwan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Sakelar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }