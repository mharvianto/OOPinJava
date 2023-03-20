package PPTI16.Session06;

import java.util.ArrayList;

public class Pion extends Perwira {

    public Pion(char col, int row, WarnaEnum warna) {
        super(col, row, warna);
    }

    @Override
    public ArrayList<Sel> kemungkinanJalan() {
        ArrayList<Sel> jalans = new ArrayList<>();
        if (getWarna() == WarnaEnum.PUTIH) {
            jalans.add(new Sel(posisi.col, posisi.row + 1));
        } else {
            jalans.add(new Sel(posisi.col, posisi.row - 1));
        }
        return jalans;
    }
}
