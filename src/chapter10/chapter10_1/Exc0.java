package chapter10.chapter10_1;

public class Exc0 {
    public static void main(String args[]) {
        int d = 0;
        int a = 42 / d;
    }

    // сгенерированного при выполнении приведенного выше кода.
    // java.lang.ArithmeticException: / Ьу zero
    // at Exc0.main(Exc0.java:6)
}