public class TokoBukuSolid {
    public static void main(String[] args) {
        Buku b1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        Buku b2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        Buku b3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        Buku b4 = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambah(b1);
        keranjang1.tambah(b2);
        keranjang1.tambah(b3);
        keranjang1.tambah(b4);

        Keranjang keranjang2 = new Keranjang();
        keranjang2.tambah(b3);

        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("=========== KERANJANG PERTAMA ===========", keranjang1);
        printer.cetakPembayaran(keranjang1.hitungTotal(), pilihan);

        printer.cetakKeranjang("============ KERANJANG KEDUA ============", keranjang2);
        printer.cetakPembayaran(keranjang2.hitungTotal(), pilihan);
    }
}