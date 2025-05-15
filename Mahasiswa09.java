package Pertemuan12;

public class Mahasiswa09 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.2f\n", nama, nim, kelas, ipk);
    }   
}
