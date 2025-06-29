public class QueueTransaksi {
    TransaksiPengisian[] data;
    int front, rear, size, max;

    public QueueTransaksi() {
        max = 100;
        data = new TransaksiPengisian[max];
        size = 0;
        front = rear = -1;
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

    public boolean enqueue(TransaksiPengisian dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh!");
            return false;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return true;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Riwayat Transaksi tidak ada!\n");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Plat nomor kendaraan :  " + data[i].kendaraan.platNomor + "       |   : Rp. " + data[i].bbm.hargaPerLiter * data[i].liter + "\n");
                i = (i + 1) % max;
            }
            System.out.println("Plat nomor kendaraan :  " + data[i].kendaraan.platNomor + "       |   : Rp. " + data[i].bbm.hargaPerLiter * data[i].liter + "\n");
        }
    }
    public void TampilkanriwayattranskasiberdasarkanjenisBBM(String namaBBM) {
        if (isEmpty()) {
            System.out.println("riwayat transaksi tidak ada !");
        } else {
            int i = front;
            boolean found = false;
            while (i != rear) {
                if (data[i].bbm.namaBBM.equalsIgnoreCase(namaBBM)) {
                    System.out.println("Plat nomor kendaraan :  " + data[i].kendaraan.platNomor + "       |   : Rp. " + data[i].bbm.hargaPerLiter * data[i].liter + "\n");
                    found = true;
                }
                i = (i + 1) % max;
            }

        }
}
}