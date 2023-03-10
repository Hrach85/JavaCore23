package chapter5;

public class ForEach2 {
    // рименение оператора break в цикле for в стиле for each
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.println("Знaчeниe равно:  " + x);
            sum += x;
            if (x == 5) {
                break; //рервать цикл после получения 5 значени
            }
        }
        System.out.println("Сумма пяти первbх элементов равна: " + sum);
    }
}
