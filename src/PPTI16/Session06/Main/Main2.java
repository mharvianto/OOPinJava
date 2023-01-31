package PPTI16.Session06.Main;

import java.util.ArrayList;

public class Main2 {

    int angka = 100;
    ArrayList<Produk> produks = new ArrayList<>();
    ArrayList<Transaksi> transaksi = new ArrayList<>();

    public Main2(){
        Produk p = new Produk();
        p.name = "asd"; // 0
        p.harga = 1000;
        produks.add(p);

        p = new Produk(); // 1
        p.name = "Pensil";
        p.harga = 2000;
        produks.add(p);

        Transaksi t = new Transaksi();
        t.produk = produks.get(1);
        t.jumlah = 3;
        t.harga = t.produk.harga;
        transaksi.add(t); // 0
        t = new Transaksi();
        t.produk = produks.get(0);
        t.jumlah = 7;
        t.harga = t.produk.harga;
        transaksi.add(t); // 1
        transaksi.add(t); // 2
        t.jumlah = 8;

        ProdukLain p1 = new ProdukLain();
        p1.name = "Roti";
        p1.harga = 10000;
        p1.merek = "Sari Roti";
        produks.add(p1);

        Produk p3 = new ProdukLain();
        p3.name = "Teh";
        p3.harga = 8000;
        produks.add(p3);

        printProduk();
        printTransaksi();

        p = new Produk();
        p.name = "gunting";
        p.harga = 2500;
        produks.add(p);

        Produk p2 = produks.get(1);
        p2.name = "Pensil Joyko";
        p2.harga = 3000;
        printProduk();
        printTransaksi();
    }

    void printProduk(){
        for(Produk produk: produks){
            System.out.println("Produk " + produk.print());
        }
        System.out.println();
    }

    void printTransaksi(){
        for(var q: transaksi){
            System.out.println("Transaksi " + q);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String a = "hore 1";
        String b = "hore 2";
        System.out.println(a.hashCode() + " " + b.hashCode() + " " + (a.equals(b)) + " " + (a == b));
        new Main2();
    }
}

class Produk
{
    static int n = 1;
    String produkId;
    String name;
    Integer harga;

    Produk() {
        produkId = String.format("P%04d", n++);
    }

    public String print() {
        return String.format("%s %s %d", produkId, name, harga);
    }
}

class ProdukLain extends Produk{

    String merek;
    @Override
    public String print() {
        return super.print() + " " + merek;
    }
}

class Transaksi
{
    Produk produk;
    Integer jumlah;
    Integer harga;

    @Override
    public String toString() {
        return produk.name + ", " + jumlah +", "+ harga +", "+ (jumlah * harga) + " " + super.toString();
    }
}
