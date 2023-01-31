package PPTI16.Session06;

import java.security.KeyPair;
import java.util.ArrayList;

public abstract class Perwira {
    private int poin;
    private WarnaEnum warna;
    protected Sel posisi;

    public WarnaEnum getWarna() {
        return warna;
    }

    protected Perwira(Sel sel, WarnaEnum warna) {
        this.posisi = sel;
        this.warna = warna;
    }

    protected Perwira(char col, int row, WarnaEnum warna) {
        poin = 1;
        this.warna = warna;
        this.posisi = new Sel(col, row);
    }

//    protected ArrayList<Sel> kemungkinanJalan(){
//        return new ArrayList<>();
//    }
    public abstract ArrayList<Sel> kemungkinanJalan();

//    toko.addProduk(new Produk());
//    produk.addProduk(new Produk());
}

