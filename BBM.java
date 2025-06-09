public class BBM{
    String namaBBM;
    double hargaperliter;
    int jumlahLiter;

    public BBM() {
    }


    public BBM(String namaBBM, double hargaperliter) {
        this.namaBBM = namaBBM;
        this.hargaperliter = hargaperliter;
        this.jumlahLiter = 0;
    }

    void tampildata() { 
        System.out.println("Nama BBM: " + namaBBM);
        System.out.println("Harga per liter: " + hargaperliter);
        System.out.println("Jumlah liter: " + jumlahLiter);
    }
}