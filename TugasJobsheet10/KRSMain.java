package TugasJobsheet10;
import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        int pilihan;
        AntrianKRS09 antrian = new AntrianKRS09(5);
        int totalMahasiswa = 30;

        do {
            System.out.println();
            System.out.println("\n=== MENU ANTRIAN KRS POLITEKNIK NEGERI MALANG ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Cek Antrian KRS");
            System.out.println("4. Tampilkan semua Antrian KRS");
            System.out.println("5. Tampilkan dua mahasiswa terdepan");
            System.out.println("6. Tampilkan Mahasiswa Terakhir");
            System.out.println("7. Kosongkan Antrian KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc09.nextInt(); 
            sc09.nextLine(); 

            switch (pilihan) {
                case 1:
                System.out.print("NIM     : ");
                String nim = sc09.nextLine(); 
                System.out.print("Nama    : ");
                String nama = sc09.nextLine();
                System.out.print("Prodi   : ");
                String prodi = sc09.nextLine();
                System.out.print("Kelas   : ");
                String kelas = sc09.nextLine();
                if (antrian.isFull()) {
                    System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa.");
                    break;
                }
                System.out.print("Mahasiswa berhasil ditambahkan ke antrian. ");
                MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                antrian.enqueueKRS09(mhs);     
                    break;

                case 2:
                MahasiswaKRS mhsDilayani = antrian.dequeueKRS09();
                if (mhsDilayani != null) {
                    System.out.println("Mahasiswa yang dilayani: ");
                    mhsDilayani.tampilkanData();
                    break;
                }

                case 3:
                antrian.cetakJumlahAntrian();
                break;

                case 4:
                antrian.tampilkanSemua();
                break;

                case 5:
                antrian.panggilAntrianKRS();
                break;

                case 6:
                antrian.tampilkanAntrianPalingAkhir();
                break;

                case 7:
                antrian.clear();
                System.out.println("Antrian berhasil dikosongkan.");
                break;

                case 0:
                System.out.println("Terima kasih telah menggunakan layanan ini.");

                default:
                System.out.println("Pilihan tidak valid.");
            }
        }    while (pilihan != 0);
        sc09.close();
    }
}
