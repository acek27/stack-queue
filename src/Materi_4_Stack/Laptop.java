package Materi_4_Stack;

public class Laptop {

    String merk;
    String warna;
    byte ukuran;
    byte ram;

    public Laptop(String m, String w, byte u, byte r) {
        merk = m;
        warna = w;
        ukuran = u;
        ram = r;
    }

    void spek() {
        System.out.println("Spesifikasi Laptop " + merk);
        System.out.println(" Warna           : " + warna);
        System.out.println(" Ukuran Layar    : " + ukuran + "\"");
        System.out.println(" Memori          : " + ram + " GB");
    }

    void proc(String processor, double kecepatan) {
        System.out.println(" Laptop " + merk + " memiliki processor " + processor + " dengan kecepatan " + kecepatan + " GHz\n");
        
    }

    void ganti(String ganti) {
        warna = ganti;
        spek();
    }
    void rusak(){
        System.out.println("Processor Rusak");
        
    }
}
