package Pertemuan12;

public class SingleLinkedList09 {
    Node09 head;
    Node09 tail;

    boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            Node09 tmp= head;
            System.out.println("Isi Linked List:\t ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong.");
        }
    }
    public void addFirst(Mahasiswa09 input) {
        Node09 ndInput = new Node09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa09 input) {
        Node09 ndInput = new Node09(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(Mahasiswa09 input, String key) {
        Node09 ndInput = new Node09(input, null);
        Node09 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa09 input) {
        if (index < 0) {
            System.out.println("Indeks salah.");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node09(input, temp.next);
            if (temp.next == null) {
                tail = temp.next;
            }
        }
    }
    public void getData(int index) {
        Node09 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        } 
        temp.data.tampilInformasi();
    }
    public int indexOf(String key) {
        Node09 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            }

    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node09 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
     public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node09 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                  temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                } temp = temp.next;
            }            
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node09 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next; 
            }
            temp.next = temp.next.next; 
            if (temp.next == null) {
                tail = temp;
            }
        } 
    }
    
}
