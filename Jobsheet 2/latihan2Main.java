public class latihan2Main {
    public static void main(String[] args) {
        latihan2 koor = new latihan2();
        koor.x=0;
        koor.y=0;
        koor.width=20;
        koor.height=20;
        koor.moveUp();
        koor.moveDown();
        koor.moveLeft();
        koor.moveRight();

        System.out.println("Selamat datang di program Pacman :)");
        System.out.println(" ");
        System.out.println("Titik awal koordinat saat ini : ");
        koor.printPosition();
        System.out.println(" ");
        System.out.println("Lalu bergerak kekiri 2x menjadi ");
        koor.moveLeft();
        koor.moveLeft();
        koor.printPosition();
        System.out.println(" ");
        System.out.println("Kemudian bergerak keatas menjadi ");
        koor.moveUp();
        koor.printPosition();
        System.out.println(" ");
        System.out.println("Setelah itu bergerak kekanan menjadi ");
        koor.moveRight();
        koor.printPosition();
        System.out.println(" ");
        System.out.println("Tujuan terakhir pacman berada setelah turun kebawah 1x, yaitu ");
        koor.moveDown();
        koor.printPosition();
    }
}
        
