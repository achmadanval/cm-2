// import java.util.Scanner;
// public class LinkedListAntrian {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int pilih; 

//         queueLL q = new queueLL();

//         do {
//             System.out.println("\n--- Menu SPBU --- ");
//             System.out.println("1. Tambah Antrian Kendaraan");
//             System.out.println("2. Tampilkan Antrian");
//             System.out.println("3. Cek Jumlah Antrian");
//             System.out.println("4. Layani Kendaraan");
//             System.out.println("5. Tampil Riwayat transaksi");
//             System.out.println("0. Keluar");
//             System.out.print("Pilih: ");
//             pilih = sc.nextInt();
//             sc.nextLine();

//             switch (pilih) {
//                 case 1:
//                     System.out.print("Masukkan Plat Nomor: ");
//                     String plat = sc.nextLine();
//                     System.out.print("Masukkan Jenis Kendaraan: ");
//                     String tipe = sc.nextLine();
//                     System.out.print("Masukkan Merk: ");
//                     String merk = sc.nextLine();
//                     Kendaraan k = new Kendaraan(plat, tipe, merk);
//                     q.tambahAntrian(k);
//                     break;
//                 case 2: 
//                     break;
//                 case 3:
//                     break;
//                 case 4:
//                     Kendaraan dilayani = q.memanggilAntrian();
//                     if (dilayani != null) {
//                         System.out.println("Petugas melayani " + dilayani.platNomor);
//                         System.out.print("Masukkan Jenis BBM: ");
//                         String namaBBM = sc.nextLine();
//                         System.out.print("Masukkan Harga per liter: ");
//                         double harga = sc.nextDouble();
//                         sc.nextLine();
//                         System.out.print("Masukkan Jumlah liter: ");
//                         int liter = sc.nextInt();
//                         sc.nextLine();
//                         BBM bbm = new BBM(namaBBM, harga);
//                         bbm.jumlahLiter = liter;

//                     }
//                     break;
//                 case 5:
//                     queueLL Qull = new queueLL();
//                     break;
//                 default:
//                     break;
//             }
//         } while (pilih != 0);
//     }
// }