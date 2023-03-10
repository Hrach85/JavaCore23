package chapter7.chapter7_1;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpb отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и Ь: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("Double а: " + a);
        return a * a;
    }
}
