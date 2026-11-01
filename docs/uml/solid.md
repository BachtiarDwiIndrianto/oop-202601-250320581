# Prinsip SOLID yang tampak pada kode

## Single Responsibility Principle (SRP)

`Peminjaman` menyimpan data satu pengajuan, memvalidasi rentang waktunya saat dibuat, dan mengelola status pengajuan. `JadwalPeminjaman` bertanggung jawab mengelola kumpulan pengajuan dan operasi terhadap jadwal. `KatalogAset` memiliki tanggung jawab terpisah untuk menyimpan serta mencari aset. Pemisahan ini membuat perubahan cara pencarian katalog tidak perlu mengubah representasi sebuah peminjaman.

## Open/Closed Principle (OCP)

`Aset` adalah kelas abstrak dengan `hitungDenda(int)` yang diimplementasikan oleh `Laptop`, `Ruang`, dan `AlatLab`. Penambahan jenis aset baru dapat dilakukan sebagai subclass dengan aturan denda sendiri, tanpa mengubah pemanggil yang bekerja terhadap tipe `Aset`. `DendaFlat` dan `DendaProgresif` juga menerapkan kontrak `AturanDenda` untuk cara hitung yang berbeda.

## Dependency Inversion Principle (DIP)

`DendaFlat` dan `DendaProgresif` bergantung pada abstraksi `AturanDenda` melalui `implements`, bukan pada kelas konkret satu sama lain. Pemakai aturan dapat diarahkan ke kontrak tersebut, sehingga implementasi perhitungan dapat diganti dan diuji terpisah. `LayananDenda` dimaksudkan sebagai konteks yang menerima kontrak ini, tetapi implementasinya masih TODO Minggu 10 dan belum diklaim sebagai contoh yang berjalan.

## Batas implementasi saat ini

`JadwalPeminjaman.ajukan()` serta `bentrok()` masih TODO Minggu 9. Karena itu sequence diagram menyatakan keterbatasan aktual tersebut dan tidak menggambarkan pengajuan sukses atau penolakan bentrok seolah-olah sudah berjalan.
