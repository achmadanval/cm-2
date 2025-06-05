import java.util.Scanner;
public class AntrianSPBUMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n--- Menu SPBU --- ");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampil Riwayat transaksi");
            System.out.println("0. Keluar");
            pilih = sc.nextInt();
            sc.next();

            switch (pilih) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        } while (pilih < 0);
    }
}
