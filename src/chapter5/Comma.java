package chapter5;

public class Comma {

    public static void main(String[] args) {
        // Использование запятой в операторе цикла for
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
