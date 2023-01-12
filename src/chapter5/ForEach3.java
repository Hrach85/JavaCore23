package chapter5;

public class ForEach3 {
    // рименение цикла for в стиле for each для
    // обращения к двухмерному массиву
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Знaчeниe равно: " + y);
                sum += y;
            }
        }
        System.out.println("yммa: " + sum);
    }
}
