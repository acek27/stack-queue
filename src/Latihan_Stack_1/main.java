package Latihan_Stack_1;

/**
 *
 * @author Ahmad Nurfawaid
 */
public class main {

    public static void main(String[] args) {
        Stack data = new Stack(5);
        data.push(3);
        data.push(2);
        data.push(1);
        data.info();
        data.pushAt(1, 5);
        data.info();
        data.popAll();
        data.info();
    }
}
