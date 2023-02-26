package chapter10.chapter10_1;

public class Exc2 {
    public static void main(String args[]) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этo не будет выведено.");
        } catch (ArithmeticException е) {
            //перехватить ошибку деления на нуль
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");
    }
}