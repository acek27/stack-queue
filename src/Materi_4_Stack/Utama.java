package Materi_4_Stack;

/**
 *
 * @author Ahmad Nurfawaid
 */
public class Utama {
    
    public static void main(String[] args) {
//        Laptop l1 = new Laptop("Acer", "Putih", (byte) 14, (byte) 4);
//        l1.spek();
//        l1.proc("Intel", 2.4);
//        l1.ganti("Merah");
//        
//        Laptop l2 = new Laptop("Asus", "Hitam", (byte) 14, (byte) 2);
//        l2.spek();
//        l2.cepat("AMD", 2.3);
        Mobil M1 = new Mobil("Putih", (byte) 4);
        M1.info();
        M1.jalan((byte) 100);
        M1.berhenti();
        M1.rem();
        M1.belok("Kanan");
    }
}
