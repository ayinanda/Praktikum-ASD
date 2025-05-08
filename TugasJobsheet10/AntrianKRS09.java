package TugasJobsheet10;

public class AntrianKRS09 {
    MahasiswaKRS[] data;
    int front, rear, size, max = 10;

    public AntrianKRS09(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
         if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan.");
        } else {
            System.out.println("Queue masih kosong.");
        }
    }
    public void lihatTerdepan09() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. ");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }
    public void enqueueKRS09 (MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }
    public MahasiswaKRS dequeueKRS09() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang bisa dikeluarkan.");
            return null;
        }
        MahasiswaKRS mhs = data[front];
        size--;
    
        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
    
        return mhs;
    }
    public void panggilAntrianKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memproses panggilan.");
            return;
        }
        System.out.println("Dua Mahasiswa pertama dalam Antrian:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS mhs = dequeueKRS09();
            if (mhs != null) {
                mhs.tampilkanData();
            }
        }
    }
    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Semua Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("Mahasiswa Terdepan dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanAntrianPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa Paling Akhir dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahProsesKRS(int totalMahasiswa) {
        int jumlahProses = totalMahasiswa - size;
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + jumlahProses);
    }
    public void cetakJumlahBelumProsesKRS() {
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + size);
    }
    
}
