package Latihan_Stack_1;

public class Stack {

    int data[], posisi;

    public Stack(int array) {
        data = new int[array];
        posisi = -1;
    }

    void push(int angka) {
        if (!penuh()) {
            posisi++;
            data[posisi] = angka;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void pushAt(int push, int angka) {
        if (!penuh()) {
            push--;
            data[push] = angka;
//            if (posisi > push) {
//                pop();
//            }
        }
    }

    void pushAll(int angka) {
        if (!penuh()) {
            do {
                posisi++;
                data[posisi] = angka;
            } while (posisi != data.length - 1);
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void pushAllpola(int angka) {
        if (!penuh()) {
            int pola = 1;
            for (int i = posisi; i < data.length; i++) {
                data[i] = angka * pola;
                pola++;
            }
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void pop() {
        if (!kosong()) {
            data[posisi] = 0;
            posisi--;
        } else {
            System.out.println("Data Sudah Kosong");
        }
    }

    void popAt(int angka) {
        while (posisi >= angka) {
            pop();
        }
    }

    void popAll() {
        if (!kosong()) {
            while (posisi > -1) {
                pop();
            }
            posisi = -1;

        } else {
            System.out.println("Data Sudah Kosong");
        }
    }

    void peek() {
        System.out.println("Data paling atas yaitu " + data[posisi]);
    }

    void size() {
        System.out.println("Jumlah data yang terisi " + (posisi + 1));
    }

    void info() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "   ");
        }
        System.out.println(" ");
    }

    boolean penuh() {
        return (posisi >= data.length - 1);
    }

    boolean kosong() {
        return (posisi < 0);
    }
}
