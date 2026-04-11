package oop_00000077033_stevenwan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("\n--- TUGAS MANDIRI 1: LIBRARY SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loanData = Loan(bookTitle, borrower, loanDuration = duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul     : ${loanData.bookTitle}")
    println("Peminjam  : ${loanData.borrower}")
    println("Lama      : ${loanData.loanDuration} hari")
    println("Total Denda: Rp ${loanData.calculateFine()}")
}
