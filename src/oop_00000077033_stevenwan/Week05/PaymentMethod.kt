package oop_00000077033_stevenwan.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}