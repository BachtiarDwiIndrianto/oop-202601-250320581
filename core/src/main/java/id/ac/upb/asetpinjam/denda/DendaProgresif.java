package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;
import java.math.BigInteger;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (aset == null) {
            throw new IllegalArgumentException("aset tidak boleh null");
        }
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("hari terlambat tidak boleh negatif");
        }
        if (hariTerlambat == 0) {
            return 0;
        }

        // Tambahan progresif bertambah linear: ceil(flat * hari / 30).
        // Dengan demikian denda selalu minimal flat dan pada hari ke-30 menjadi 2x flat.
        long flat = aset.hitungDenda(hariTerlambat);
        BigInteger nilaiFlat = BigInteger.valueOf(flat);
        BigInteger tambahan = nilaiFlat.multiply(BigInteger.valueOf(hariTerlambat))
                .add(BigInteger.valueOf(29))
                .divide(BigInteger.valueOf(30));
        BigInteger total = nilaiFlat.add(tambahan);
        return total.min(BigInteger.valueOf(Long.MAX_VALUE)).longValue();
    }
}
