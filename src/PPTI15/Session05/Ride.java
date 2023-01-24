package PPTI15.Session05;

public class Ride extends Service {
    private int jumlahPenumpang;

    public Ride(String plate, String noHandphoneCustomer, String alamatAsal, String alamatTujuan) {
        super(plate, noHandphoneCustomer, alamatAsal, alamatTujuan);
        jumlahPenumpang = 1;
    }

    public Ride(String plate, String noHandphoneCustomer, String alamatAsal, String alamatTujuan, int jumlahPenumpang) {
        super(plate, noHandphoneCustomer, alamatAsal, alamatTujuan);
        this.jumlahPenumpang = jumlahPenumpang;
    }
}
