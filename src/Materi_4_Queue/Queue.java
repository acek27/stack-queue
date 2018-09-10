package Materi_4_Queue;

public class Queue {

    int data[], top, rear;

    public Queue(int array) {
        data = new int[array];
        top = -1;
        rear = -1;
    }

    void insert(int angka) {
        if (!penuh()) {
            top++;
            data[++rear] = angka;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void insertAll(int angka) {
        if (!penuh()) {
            do {
                data[++rear] = angka;
            } while (rear != data.length - 1);
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void remove() {
        if (!kosong()) {
            data[top++] = 0;
        }
    }

    void info() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
        System.out.println("");
    }

    boolean penuh() {
        return (rear == data.length - 1);
    }

    boolean kosong() {
        return (top < 0);
    }
    void peek (){
        System.out.println(data[top]);
    }
    void size (){
        System.out.println((rear-top)+1);
    }
}
