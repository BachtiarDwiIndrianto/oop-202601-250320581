package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/** Katalog aset di memori. tambah() dan semua() DISEDIAKAN; Anda mengerjakan dua overload cari() (minggu 4). */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    /** Mengembalikan aset dengan nama yang memuat kata tanpa membedakan kapitalisasi. */
    public List<Aset> cari(String kata) {
        String kataDicari = kata.toLowerCase(Locale.ROOT);
        return daftar.stream()
                .filter(aset -> aset.getNama().toLowerCase(Locale.ROOT).contains(kataDicari))
                .toList();
    }

    /** Seperti cari(kata), dengan hasil dibatasi pada jenis aset yang diminta. */
    public List<Aset> cari(String kata, JenisAset jenis) {
        String kataDicari = kata.toLowerCase(Locale.ROOT);
        return daftar.stream()
                .filter(aset -> aset.getJenis() == jenis)
                .filter(aset -> aset.getNama().toLowerCase(Locale.ROOT).contains(kataDicari))
                .toList();
    }
}
