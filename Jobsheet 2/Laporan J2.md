# LAPORAN JOBSHEET 2 PRAKTIKUM STRUKTUR DATA

Bagus Dwi Putranto / 1F D4 Teknik Informatika / 2141720079

### 2.2 Deklarasi Class, Atribut dan Method

### 2.2.1 Langkah-langkah percobaan
3. Coba jalankan (Run) class Barang tersebut. Apakah bisa?
   : Tidak bisa

### 2.2.3 Pertanyaan
1. Sebutkan 2 karakteristik class/objek!
  : - setiap objek berawal dari suatu rancangan class
    - objek tidak akan ada jika tidak ada class
    - class tidak akan bisa digunakan jika belum dibuat objeknya
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
  : Untuk mendeklarasikan class menggunakan kata kunci “class” yang diikuti dengan nama class-nya.
3. Perhatikan class Barang yang ada di praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Subtkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
  : Ada 4. namaBarang, jenisBarang, stok, hargaSatuan. Baris ke 2-3
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja method dilakukan?
  : Ada 4. tampilBarang, tambahStok, kurangiStok,hitungHargaTotal. Baris ke 5, 11, 14, 17
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut 
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 
  : void kurangStok (int n){
        if(stok > 0){
            stok=stok-n;
        }
    }
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa 
bilangan int?
  : Untuk mengisikan berapa kita ingi menambah stok barang tersebut, dan variablenya berupa interger
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
  : Karena outputnya berupa variable angka, untuk harga sebaiknya menggunakan Double, karena kemungkinan outputnya berbentuk bilangan desimal
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
  : Karena tambahStok() dibuat hanya untuk mempersingkat code untuk penambahan stok, tidak untuk agar memiliki nilai (tidak memakai return)

### 2.3 Instansiasi Objek dan Mengakses Atribut dan Method

### 2.3.1 Langkah-langkah Percobaan
### 2.3.3 Pertanyaan
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan?
  : Baris ke-3, dan nama objek yang dihasilkan adalah Barang
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
  : Atribut
    namaObjek.namaAtribut = nilai; (b1.stok=10);

    Method
    namaObjek.namaMethod(); (b1.tampilBarang();

### 2.4 Membuat Konstruktor

### 2.4.3 Pertanyaan
1. Perhatikan class Barang yang ada di praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan?
  : Baris ke-7
2. Perhatikan class BarangMain di praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program di bawah ini?
  : Instansiasi konstruktor
3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang.
  : 
