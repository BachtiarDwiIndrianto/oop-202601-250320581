# Catatan Minggu 02: Class, Object, dan Encapsulation

## Yang saya kerjakan
Saya melengkapi class `Aset` dengan field privat, konstruktor, getter, dan setter. Konstruktor dan `setNama` menolak nilai null atau teks kosong, sedangkan setter status dan kondisi menolak null. Saya juga memberi nilai awal status TERSEDIA dan kondisi BAIK.

## Keputusan desain
Kode dan nama divalidasi menggunakan `isBlank()` agar teks yang hanya berisi spasi ditolak. Nilainya disimpan apa adanya, tanpa trim atau mengubah huruf besar-kecil. Kode dibuat `final` dan hanya memiliki getter supaya tidak dapat diubah setelah objek dibuat.

## Kendala
Validasi perlu membedakan teks yang terlihat kosong karena berisi spasi dari teks valid. Saya menggunakan `String.isBlank()` dan melakukan validasi sebelum menyimpan nilai agar objek tidak menerima data yang tidak sah.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Meninjau kebutuhan implementasi `Aset`, validasi, dan keputusan normalisasi.
- Prompt utama: “bantu saya kerjakan minggu 02”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya memilih memvalidasi spasi tanpa mengubah nilai asli agar kode dan nama tetap sesuai input.
- Satu hal yang saya pahami lebih baik sekarang: Field privat dan setter yang memvalidasi membantu menjaga agar perubahan state objek tetap sah.
