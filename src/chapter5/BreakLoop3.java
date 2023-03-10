package chapter5;

public class BreakLoop3 {
    // Применение оператора brack во вложеннbх циклах
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break; // вbход из цикла, значение переменной j равно 10
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклb завершенb. ");
    }
}
