public class AntrianLayanan09 {
        Mahasiswa09 [] data;
        int front, rear, size, max;
    
        public AntrianLayanan09(int max) {
            this.max = max;
            this.data = new Mahasiswa09[max];
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
        public void clear() {
            if (!isEmpty()) {
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan.");
            } else {
                System.out.println("Queue masih kosong.");
            }
        }
        public void tambahAntrian09 (Mahasiswa09 mhs) {
            if (isFull()) {
                System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
                return;
            } 
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
        
        public Mahasiswa09 layaniMahasiswa09 () {
            int dt = 0;
            if (isEmpty()) {
                System.out.println("ANtrian kosong.");
                return null;
            } 
            Mahasiswa09 mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }
        public int getJumlahAntrian() {
            return size;
        }
        public void lihatAkhir () {
            if (isFull()) {
                System.out.println("Antrian penuh. ");
            } else {
                System.out.print("Mahasiswa terbelakang: "); 
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[rear].tampilkanData();
            }
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }

