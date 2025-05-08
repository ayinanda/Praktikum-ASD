import java.util.Scanner;

public class Queue09Main {
    public static void menu() {
        System.out.println();
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Exit");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc09.nextInt();
        Queue09 q = new Queue09(n);
        int pilih;

        do {
            menu();
            pilih = sc09.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc09.nextInt();
                    q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = q.Dequeue();
                    if (dataKeluar != -1) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                   q.peek();
                    break;
                case 5:
                    q.clear();
                    System.out.println("Queue berhasil dikosongkan.");
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
