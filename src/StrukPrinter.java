public class StrukPrinter {

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(judul);
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(b.getHarga()));
            System.out.println("  Keterangan  : " + b.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(b.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar metode : pilihan) {
            int bayar = metode.totalBayar(totalBelanja);
            System.out.printf("%-20s : %s%n", metode.nama(), Buku.formatRupiah(bayar));
        }
        System.out.println();
    }
}