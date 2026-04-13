package oop_00000077033_stevenwan.Week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------")
    }

    val math = MathHelper()

    val persegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $persegi")

    val persegiPanjang = math.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5): $persegiPanjang")

    val lingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $lingkaran")
}