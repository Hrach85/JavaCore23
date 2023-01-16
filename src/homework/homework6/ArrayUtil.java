package homework.homework6;

public class ArrayUtil {

    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max + ", ");
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min + ", ");
    }

    void evenNumberOfArray(int[] array) {
        int evenNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
                evenNumber++;
            }
        }
        System.out.println();
        System.out.println("number of even numbers = " + evenNumber);
    }

    void oddNumberOfArray(int[] array) {
        int oddNumber = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 != 0) {
                System.out.print(array[a] + ", ");
                oddNumber++;
            }
        }
        System.out.println();
        System.out.println("number of odd numbers = " + oddNumber);
    }

    void arithmeticAveragesOfArray(int[] array) {
        int arithmeticAverages = 0;
        for (int i = 0; i < array.length; i++) {
            arithmeticAverages = arithmeticAverages + array[i];
        }
        System.out.println("էլեմենտների գումարը = " + arithmeticAverages);
    }
}