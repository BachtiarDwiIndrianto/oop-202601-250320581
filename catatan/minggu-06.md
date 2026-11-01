# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membaca kelas model, jadwal, kontrak, dan denda yang sudah ada lalu membuat class diagram dengan paket, field, method, visibilitas, tipe, dan relasi. Saya juga membuat sequence diagram pengajuan dan catatan prinsip SOLID berdasarkan kode saat ini.

## Keputusan desain
Diagram mengikuti implementasi yang tersedia. `JadwalPeminjaman.ajukan()` dan `bentrok()` masih TODO Minggu 9, jadi diagram sequence menandai keterbatasan ini dan tidak menyatakan alur sukses atau bentrok sudah berjalan.

## Kendala
Instruksi sequence meminta alur sukses dan bentrok, sedangkan metode pengajuan belum diimplementasikan pada tahap ini. Saya mencatat batas tersebut secara eksplisit agar diagram tetap jujur terhadap kode.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: penyusunan class diagram, sequence diagram, dan uraian SOLID.
- Prompt utama: “kerjakan minggu-06 dan jelaskan alurnya mengapa bisa seperti itu”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya tidak memasukkan alur sukses/bentrok seolah-olah sudah aktif; `bentrok()` dan `ajukan()` masih TODO pada kode, sehingga diagram menyebutkannya terang-terangan.
- Satu hal yang saya pahami lebih baik sekarang: Diagram UML perlu menunjukkan implementasi yang benar-benar ada, termasuk bagian yang belum selesai, supaya pembaca tidak mengira kontrak yang direncanakan sudah bisa dijalankan.
