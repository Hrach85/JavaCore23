package homework.nomework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        System.out.println(mycalculator.plus(25,30));
        System.out.println(mycalculator.minus(470, 100));
        System.out.println(mycalculator.divide(50, 5));
        System.out.println(mycalculator.multiply(12,4));

        System.out.println(mycalculator.divide(20,0));

    }
}
