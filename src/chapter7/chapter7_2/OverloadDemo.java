package chapter7.chapter7_2;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют: ");
    }

    void test(int a, int b) {
        System.out.println("a и Ь: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове " + "test(douЬle) а: " + a);
    }
}