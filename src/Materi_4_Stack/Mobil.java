package Materi_4_Stack;

public class Mobil {

    byte roda;
    String warna;
    boolean parameter;
    boolean parameter2;

    public Mobil(String w, byte r) {
        roda = r;
        warna = w;
        parameter = false;
        parameter2 = false;
    }

    void info() {
        System.out.println("Mobil ini berwarna " + warna + " dan mempunyai roda " + roda);
    }

    void jalan(byte jarak) {
        if (parameter == false) {
            System.out.println("Mobil ini berjalan " + jarak + " Km");
            parameter = true;
        } else {
            System.out.println("Error, Mobil Sedang Berjalan");
        }
    }

    void berhenti() {
        if (parameter == true) {
            System.out.println("Mobil ini berhenti");
            parameter = false;
        } else {
            System.out.println("Error, Mobil Sedang Berhenti");
        }
    }

    void rem() {
        if (parameter2 == false) {
            System.out.println("Mobil di rem");
            parameter2 = true;
        } else {
            System.out.println("Error, Mobil Sedang Di Rem");
        }
    }

    void belok(String arah) {
        if (parameter2 == true) {
            System.out.println("Mobil Sedang Belok " + arah);
            parameter2 = false;
        } else {
            System.out.println("Mobil Kecelakaan");
        }
    }
}
