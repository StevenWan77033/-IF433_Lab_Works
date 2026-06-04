package oop_00000077033_stevenwan.week06

class SmartCCTV : SmartDevice(), Switchable, Recordable {

    override fun turnOn() {
        super.turnOn()

        startRecord()
    }

    override fun turnOff() {
    }

    override fun startRecord() {
        println("SmartCCTV: Mulai merekam...")
    }

    override fun stopRecord() {
    }
}
