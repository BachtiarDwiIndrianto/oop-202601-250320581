# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya menambahkan overriding `hitungDenda(int)` pada `Ruang`, `Laptop`, dan `AlatLab`. Tarif dasar diambil dari `Varian.aktif().dendaPerHari`, lalu dikalikan jumlah hari dan multiplier jenis aset. Saya juga melengkapi dua overload `KatalogAset.cari` untuk mencari nama secara tidak peka kapitalisasi, dengan overload kedua membatasi jenis aset.

## Keputusan desain
Validasi hari negatif dan rumus dasar diletakkan di helper `Aset`, sehingga tiap override menggunakan aturan validasi yang sama dan hanya menentukan multiplier (1, 2, atau 4). Perkalian dimulai sebagai `long` agar hasil tidak lebih dulu meluap sebagai `int`. Pencarian mengubah teks menjadi huruf kecil dengan `Locale.ROOT` agar hasil tidak bergantung pada locale mesin.

## Kendala
Saya memastikan tarif per hari tidak ditulis sebagai angka tetap karena besarnya ditentukan oleh digit terakhir NIM. Mengambilnya dari `Varian.aktif()` membuat seluruh jenis aset memakai konfigurasi mahasiswa yang sama.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi overriding denda, overload pencarian katalog, dan catatan desain.
- Prompt utama: “kerjakan minggu-04”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya memakai helper bersama untuk validasi hari dan rumus denda supaya tiga override konsisten; tiap subclass tetap menetapkan multipliernya sendiri.
- Satu hal yang saya pahami lebih baik sekarang: Dynamic binding memilih implementasi `hitungDenda` berdasarkan kelas objek walaupun variabelnya bertipe `Aset`, sementara overload dipilih dari jumlah dan tipe argumen saat kompilasi.
