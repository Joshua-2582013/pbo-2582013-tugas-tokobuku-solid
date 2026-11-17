public interface MetodeBayar {
    String nama();

    /**
     * Menghitung total yang harus dibayar berdasarkan totalBelanja.
     * Kontrak (LSP): Hasil kembalian tidak pernah negatif (selalu >= 0).
     */
    int totalBayar(int totalBelanja);
}