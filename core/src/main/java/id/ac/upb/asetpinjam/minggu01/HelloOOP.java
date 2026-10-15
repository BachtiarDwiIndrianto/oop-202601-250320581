package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 1, gaya OOP: data dan perilaku dibungkus dalam sebuah class. */
public class HelloOOP {

    // Identitas mahasiswa disimpan sebagai state objek.
    private final String nama;
    private final String nim;

    public HelloOOP(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    /** Menghasilkan sapaan yang memuat nama dan NIM mahasiswa. */
    public String sapa() {
        return "Halo, " + nama + "! Selamat datang di Aset-Pinjam (NIM: " + nim + ")";
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(new HelloOOP(v.nama, v.nim).sapa());
    }
}
