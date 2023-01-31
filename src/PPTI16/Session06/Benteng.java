package PPTI16.Session06;

import java.util.ArrayList;

public class Benteng extends Perwira {
    protected Benteng(char col, int row, WarnaEnum warna) {
        super(col, row, warna);
    }

    @Override
    public ArrayList<Sel> kemungkinanJalan() {
        return null;
    }
}
