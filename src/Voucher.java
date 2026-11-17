public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    @Override
    public int totalBayar(int totalBelanja) {
        // Keluaran saat masih memakai `return totalBelanja - nilai;` (melanggar kontrak LSP):
        // Voucher Rp100.000    : Rp-36.000

        // Perbaikan agar patuh kontrak (hasil tidak pernah negatif):
        return Math.max(0, totalBelanja - nilai);
    }
}