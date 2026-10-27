package id.ac.upb.asetpinjam.model;

/** Minggu 3: alat laboratorium. Laboratorium tidak boleh kosong; risiko tidak boleh null. */
public class AlatLab extends Aset {

    private final String laboratorium;
    private final TingkatRisiko tingkatRisiko;

    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
        this.laboratorium = wajibDiisi(laboratorium);
        if (tingkatRisiko == null) {
            throw new IllegalArgumentException("tingkat risiko tidak boleh null");
        }
        this.tingkatRisiko = tingkatRisiko;
    }

    private static String wajibDiisi(String laboratorium) {
        if (laboratorium == null || laboratorium.isBlank()) {
            throw new IllegalArgumentException("laboratorium tidak boleh null atau kosong");
        }
        return laboratorium;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }

    // Minggu 4: override hitungDenda(int).
}
