import java.util.Scanner;
public class LayananAkademikSiakad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan09 antrian = new AntrianLayanan09(5);
        int pilihan;

        do {
            System.out.println("\n===Menu Layanan Akademik Siakad Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terbelakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("NIM         : ");
                String nim = sc.nextLine(); 
                System.out.print("Nama        : ");
                String nama = sc.nextLine();
                System.out.print("Prodi       : ");
                String prodi = sc.nextLine();
                System.out.print("Kelas       : ");
                String kelas = sc.nextLine();
                Mahasiswa09 mhs = new Mahasiswa09(nim, nama, prodi, kelas);
                antrian.tambahAntrian09(mhs);    
                    break;
            
                case 2:
                Mahasiswa09 mhsDilayani = antrian.layaniMahasiswa09();
                if (mhsDilayani != null) {
                    System.out.println("Mahasiswa yang dilayani: ");
                    mhsDilayani.tampilkanData();      
            }
            break;
            
                case 3:
                    antrian.lihatTerdepan09();
                    break;
            
                case 4:
                    antrian.tampilkanSemua();
                    break;
            
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        while (pilihan != 0);
        sc.close();
    } 
}
