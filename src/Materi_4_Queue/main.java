package Materi_4_Queue;

public class main {

    public static void main(String[] args) {
        Queue data = new Queue(5);
        data.insert(5);
        data.insert(3);
        data.info();
        data.insertAll(4);
        data.info();
        data.remove();
        data.info();
        data.size();
        data.info();
    }
}
