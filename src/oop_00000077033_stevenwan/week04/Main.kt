package oop_00000077033_stevenwan.week04

fun main() {
    val boss = Manager("Budi", 10000000)
    val coder = Developer("Aris", 8000000, "Kotlin")

    println("--- Data Manager ---")
    boss.work()
    println("Bonus: Rp${boss.calculateBonus()}")

    println("\n--- Data Developer ---")
    coder.work()
    println("Bonus: Rp${coder.calculateBonus()}")

    println("   ")

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar("Tesla Model 3", 4, 90)

    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()
}