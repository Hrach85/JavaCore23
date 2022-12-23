package homework.homework2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {7, 25, 38, 15, 77, 22, 31, 99, 14, 70};
        int max = 0, min = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


        for (int i = 0; i < min; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        System.out.println(min);
    }
}
