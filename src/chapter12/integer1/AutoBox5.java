package chapter12.integer1;

public class AutoBox5 {
    public static void main(String[] args) {

        // Автоупаковка/распаковка логического значения типа boolean
        Boolean b = true;

        if (b) {
            // бъект b автоматически распаковывается, огда он употребляется в условном операторе if
            System.out.println("b равно true");
        }

        // Автоупаковка/распаковка значения типа char
        Character ch = 'x';

        char ch2 = ch;
        System.out.println("ch2 равно " + ch2);
    }
}