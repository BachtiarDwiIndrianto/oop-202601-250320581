# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya menjadikan `Aset` kelas abstrak dan menetapkan `hitungDenda(int)` sebagai metode abstrak, karena setiap jenis aset menghitung denda dengan multipliernya sendiri. Saya melengkapi `bisaDipinjam()` berdasarkan status dan kondisi aset, serta mengimplementasikan strategi denda flat dan progresif.

## Keputusan desain
Denda progresif dihitung sebagai denda flat ditambah `ceil(denda flat × hari terlambat / 30)`. Rumus ini membuat denda tidak pernah lebih murah daripada flat, terus naik seiring bertambahnya hari, dan menjadi dua kali flat pada hari ke-30. Keputusan ini juga dicatat di `docs/asumsi.md`.

## Kendala
Setelah `Aset` dijadikan abstrak, kelas induk tidak boleh lagi menyediakan implementasi denda yang menggantikan perhitungan khusus subclass. Saya mempertahankan helper perhitungan multiplier agar validasi hari negatif dan tarif setiap subclass tetap konsisten.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi abstraksi `Aset`, `bisaDipinjam()`, strategi denda flat dan progresif, serta dokumentasi keputusan desain.
- Prompt utama: “kerjakan minngu-05 dan jelaskan setiap alurnya”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya memilih rumus tambahan progresif linear sampai hari ke-30 agar mudah dijelaskan dan memenuhi syarat minimal tugas.
- Satu hal yang saya pahami lebih baik sekarang: Kelas abstrak dapat memusatkan data dan perilaku bersama, sementara subclass wajib menyediakan perilaku yang memang berbeda.
