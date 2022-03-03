public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Razer Blackmamba";
        b1.jenisBarang = "Mouse";
        b1.hargaSatuan = 500000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);

        Barang b2 = new Barang("Logitech","keyboard",5,500000);
        b2.tampilBarang();

        Barang b3 = new Barang("Corsair","Mouse Pad",1,300000);
        b3.tampilBarang();
    }
}