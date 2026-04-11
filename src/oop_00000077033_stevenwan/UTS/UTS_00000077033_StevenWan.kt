package oop_00000077033_stevenwan.UTS

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val menuList = listOf(
        FoodMenu("f01", 25000, "Nasi Goreng Spesial", 2000),
        FoodMenu("f02", -15000, "Ayam Bakar(Test Negative)", 1500),
        DrinkMenu("d01", 10000, "Es Teh Manis", true),
        DrinkMenu("d02", 15000, "Jus Jeruk", false)
    )

    println("--- Welcome to UMN Catering ---")

    print("Enter Name: ")
    val name = scanner.nextLine()
    print("Enter Phone: ")
    val phone = scanner.nextLine()
    print("Enter Address: ")
    val address = scanner.nextLine()

    val customer = Customer(name, phone, address)
    val order = CateringOrder(customer)

    while (true) {
        println("\nAvailable Menu:")
        menuList.forEachIndexed { index, menu ->
            print("${index + 1}. ")
            menu.printMenuDetails()
        }
        print("Select menu number (or 0 to checkout): ")
        val choice = scanner.nextInt()

        if (choice == 0) break

        if (choice in 1..menuList.size) {
            print("Enter quantity: ")
            val qty = scanner.nextInt()
            if (qty > 0) {
                order.addItem(menuList[choice - 1], qty)
                println("Added to order.")
            }
        } else {
            println("Invalid choice!")
        }
    }

    order.status = OrderStatus.COOKING
    order.printInvoice()
}

enum class OrderStatus {
    WAITING_LIST, COOKING, DELIVERED
}

interface IBillable {
    fun calculateSubtotal(): Int
    fun printMenuDetails()
}

data class Customer(
    val name: String,
    val phoneNumber: String,
    val address: String
)

abstract class CateringMenu(
    menuCode: String,
    basePrice: Int
) : IBillable {

    var menuCode: String = ""
        set(value) { field = value.uppercase() }
        get() = "UMN-$field"

    var basePrice: Int = 0
        set(value) {
            if (value < 0) {
                println("[ERROR] Price cannot be negative!")
                field = 0
            } else {
                field = value
            }
        }

    init {
        this.menuCode = menuCode
        this.basePrice = basePrice
    }
}

class FoodMenu(
    menuCode: String,
    basePrice: Int,
    val foodName: String,
    private val packagingFee: Int
) : CateringMenu(menuCode, basePrice) {

    override fun calculateSubtotal(): Int = basePrice + packagingFee

    override fun printMenuDetails() {
        println("[$menuCode] $foodName")
        println("Base Price: Rp$basePrice | Packaging: Rp$packagingFee")
    }
}

class DrinkMenu(
    menuCode: String,
    basePrice: Int,
    val drinkName: String,
    private val isLargeSize: Boolean
) : CateringMenu(menuCode, basePrice) {

    private val sizeSurcharge = if (isLargeSize) 5000 else 0

    override fun calculateSubtotal(): Int = basePrice + sizeSurcharge

    override fun printMenuDetails() {
        val sizeLabel = if (isLargeSize) "Large" else "Regular"
        println("[$menuCode] $drinkName ($sizeLabel)")
        println("Base Price: Rp$basePrice | Size Surcharge: Rp$sizeSurcharge")
    }
}

class CateringOrder(val customer: Customer) {
    private val orderItems = mutableListOf<Pair<CateringMenu, Int>>()
    var status: OrderStatus = OrderStatus.WAITING_LIST

    fun addItem(menu: CateringMenu, quantity: Int) {
        orderItems.add(Pair(menu, quantity))
    }

    fun printInvoice() {
        println("\n================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phoneNumber})")
        println("Address : ${customer.address}")
        println("Status  : $status")
        println("-----------------------------------------")

        var grandTotal = 0
        orderItems.forEach { (menu, qty) ->
            val subtotal = menu.calculateSubtotal() * qty
            grandTotal += subtotal
            println("${qty}x ${menu.menuCode}")
            menu.printMenuDetails()
            println("Subtotal: Rp$subtotal,00")
            println("-----------------------------------------")
        }
        println("GRAND TOTAL: Rp$grandTotal,00")
        println("=========================================")
    }
}