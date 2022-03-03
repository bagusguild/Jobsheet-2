import java.util.Scanner;

public class latihan1Main {
    public static void main(String[] args) {
        latihan1 z1 = new latihan1();
        Scanner kipe = new Scanner(System.in);
        z1.nama="Jajanan";
        z1.hargaSatuan=10000;
        
        System.out.println(z1.nama);
        System.out.println("dengan harga : "+z1.hargaSatuan);
        System.out.println(" ");
        
        System.out.print("Berapa banyak anda ingin memesan jajanan : ");
        int beli = kipe.nextInt();
        z1.jumlah = beli;

        z1.hitungHargaTotal();
        z1.hitungDiskon();
        z1.hitungHargaBayar();

        if(z1.hitungDiskon()<=50000){
            System.out.println("Selamat anda mendapatkan diskon sebanyak : "+z1.hitungDiskon());
            System.out.println(("Total harga yang harus anda bayar adalah : ")+ z1.hitungHargaBayar());
        }else{
            System.out.println("Maaf anda tidak mendapatkan diskon");
            System.out.println(("Total harga yang harus anda bayar adalah : ")+ z1.hitungHargaBayar());
        }
    }
}