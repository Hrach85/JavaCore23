package chapter5;

public class BreackLoop4 {
    // Применение оператора Ьreak для вbхода из вложеннbх циклов
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; // вbход из обоих циклов
                }
                System.out.print(j + " ");
            }
            System.out.println("Эта строка не будет вbводиться");
        }
    }
}
