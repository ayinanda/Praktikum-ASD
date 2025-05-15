package Pertemuan12;

public class SLLMain09 {
    public static void main(String[] args) {
        Mahasiswa09 mhs1 = new Mahasiswa09("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa09 mhs2 = new Mahasiswa09("22212202", "Cintia", "3C", 3.5);
        Mahasiswa09 mhs3 = new Mahasiswa09( "23212201", "Bimon", "2B", 3.8);
        Mahasiswa09 mhs4 = new Mahasiswa09("21212203", "Dirga", "4D", 3.6);

    SingleLinkedList09 sll = new SingleLinkedList09();
    sll.print();
    sll.addFirst(mhs4);
    sll.print();
    sll.addLast(mhs1);
    sll.print();
    sll.insertAfter(mhs2, "Dirga");
    sll.insertAt(2, mhs3);
    sll.print();

    System.out.println("data index 1 :");
    sll.getData(1);

    System.out.println("data mahasiswa AN Bimon berada pada index : " + sll.indexOf("Bimon"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
    }

}
       