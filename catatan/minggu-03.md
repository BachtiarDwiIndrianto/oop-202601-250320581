# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya melengkapi `Ruang`, `Laptop`, dan `AlatLab` sebagai turunan `Aset`. Setiap kelas menyimpan data khususnya sendiri, memvalidasi nilai yang diwajibkan, menyediakan getter, dan mengembalikan jenis aset yang sesuai. Konstruktor subclass memanggil konstruktor induk agar validasi kode dan nama dari `Aset` tetap dijalankan.

## Keputusan desain
Kode dan nama serta status dan kondisi umum tetap berada di `Aset`. Kapasitas, spesifikasi, nomor inventaris, laboratorium, dan tingkat risiko hanya dimiliki subclass yang memerlukannya. Field khusus dibuat `final` karena tugas ini tidak menyediakan perubahan untuk data tersebut setelah objek dibuat. Teks yang null atau blank ditolak dengan `isBlank()` tanpa mengubah teks valid yang diberikan.

Komposisi lebih tepat untuk informasi lokasi aset yang dapat berubah atau dipakai bersama, misalnya objek `Lokasi` yang berisi gedung dan lantai. Lokasi bukan jenis aset, dan satu lokasi dapat merujuk ke banyak aset; memasukkannya sebagai subclass akan mencampuradukkan hubungan “memiliki lokasi” dengan “adalah aset”.

## Kendala
Saya perlu memastikan bahwa data umum tetap divalidasi oleh konstruktor `Aset`, sementara data khusus divalidasi di subclass. Pemanggilan `super(kode, nama)` lebih dulu menjaga validasi induk, lalu setiap subclass memeriksa field tambahannya sebelum menyimpan nilai.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi konstruktor, validasi, getter, `getJenis()`, dan penyusunan catatan desain.
- Prompt utama: “bantu saya kerjakan minngu-03”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menetapkan sendiri field umum dan khusus berdasarkan perannya, serta memilih field khusus immutable karena tidak ada aturan untuk mengubahnya.
- Satu hal yang saya pahami lebih baik sekarang: Subclass dapat memakai ulang validasi dan data umum dari induk, sementara komposisi lebih cocok untuk hubungan kepemilikan seperti aset yang berada di suatu lokasi.
