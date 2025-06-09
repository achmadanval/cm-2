public class queueLL {
    Node front, rear;
    int size = 0;
    Node headRiwayat, tailRiwayat;


    boolean isEmpty(){
        return front == null;
    }

    public Kendaraan memanggilAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong tidak ada yang dipanggil");
            return null;
        }else{
            Kendaraan knd = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
           // System.out.println("Memanggil: " + knd);
            
            Node riwayatNode = new Node(knd);
            if (headRiwayat == null) {
                headRiwayat = tailRiwayat = riwayatNode;
            }else{
                tailRiwayat.next = riwayatNode;
                tailRiwayat = riwayatNode;
            }
            return knd;
        }
    }

    public void RiwayatTransaksi(){
        if (headRiwayat == null) {
            System.out.println("Belum ada Transaksi");
        }else {
            System.out.println("\n-----Riwayat Transaksi-----");
            Node temp = headRiwayat;
            while (temp != null) {
                System.out.println("-> " + temp.data);
                temp = temp.next;
            }
        }
    }
    public void tambahAntrian(Kendaraan data){
    Node newNode = new Node(data);
    if (isEmpty()) {
        front = rear = newNode;
    } else {
        rear.next = newNode;
        rear = newNode;
    }
    size++;
    System.out.println(">> Kendaraan masuk ke dalam antrian.");
}
}
