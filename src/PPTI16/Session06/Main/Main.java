package PPTI16.Session06.Main;

import PPTI16.Session06.Pion;
import PPTI16.Session06.Sel;
import PPTI16.Session06.WarnaEnum;

import java.util.ArrayList;

public class Main {
    /*
    overloading
    - nama function sama
    - jumlah parameter beda
    - type data parameter beda

    overriding
    - nama function sama
    - beda antar class
     */

    // abstract class -> class yang memiliki abstract method / function

    // abstract method -> method yang belum di deskripsikan

    // interface
    // semua method adalah abstract
    // semua attributenya const
    public static void main(String[] args) {
        // Perwira p = new Perwira('A', 1, WarnaEnum.PUTIH);
        Pion pion = new Pion('A', 2, WarnaEnum.PUTIH);

        ArrayList<Sel> jalan = pion.kemungkinanJalan();
        for (Sel sel : jalan) {
            System.out.println("" + sel.col + sel.row);
        }

    }
}
/*

void sort(); // prototype

int main(){
    return 0;
}

void sort() {
    printf("ini sort");
}
 */

