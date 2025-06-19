public class Kendaraan {

    String platNomor, tipe, merk;

    Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInformasi() {
        System.out.println("Plat Nomor Kendaraan : " + platNomor);
        System.out.println("Tipe Kendaraan       : " + tipe);
        System.out.println("Merek Kendaraan      : " + merk);
    }

    public String getPlatNomor() {
        return platNomor;
    }
}
