package chapter5;

public class BreakLoop {
    // Применение оператора break для вbхода из цикла
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break; // вbйти из цикла, если значение переменной i равно 10
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен. ");
    }
}
