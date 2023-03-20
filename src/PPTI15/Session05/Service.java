package PPTI15.Session05;

import java.util.ArrayList;

public class Service {
    protected String driverName;
    protected String plate;
    protected String alamatTujuan;
    protected String namaCustomer;
    protected String noHandphoneCustomer;
    protected String alamatAsal;

    public Service(String plate, String noHandphoneCustomer, String alamatAsal, String alamatTujuan) {
        this.plate = plate;
        this.alamatTujuan = alamatTujuan;
        this.noHandphoneCustomer = noHandphoneCustomer;
        this.alamatAsal = alamatAsal;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getPlate() {
        return plate;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNoHandphoneCustomer() {
        return noHandphoneCustomer;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    public int CalculatePrice() {
        return (alamatAsal + alamatTujuan).length() * 1000;
    }
}

class Food extends Service {
    private ArrayList<String> products;

    public Food(String plate, String noHandphoneCustomer, String alamatAsal, String alamatTujuan) {
        super(plate, noHandphoneCustomer, alamatAsal, alamatTujuan);
        products = new ArrayList<>();
    }
}

class Delivery extends Service {
    int berat;

    public Delivery(String plate, String noHandphoneCustomer, String alamatAsal, String alamatTujuan, int berat) {
        super(plate, noHandphoneCustomer, alamatAsal, alamatTujuan);
        this.berat = berat;
    }
}
