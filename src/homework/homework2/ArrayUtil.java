package homework.homework2;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {7, 25, 38, 15, 77, 22, 31, 99, 14, 70};
        int max, min, lastNumber, evenNumber, oddNumber, meanNumber,
                arithmeticAverages;
        max = array[0];
        min = array[0];
        lastNumber = 0;
        evenNumber = 0;
        oddNumber = 0;
        meanNumber = 0;
        arithmeticAverages = 0;


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.print(max + ", ");
        System.out.println();

        for (int i = 0; i < min; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print(min + ", ");
        System.out.println();


        // homework 2.2
        System.out.println("homework2 " + "example2");

        // Տպել բոլոր զույգ էլեմենտները; զույգերի քանակը։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
                evenNumber++;
            }
        }

        // Տպել  մեջտեղի էլեմենտը, վերջին էլեմենտը,
        // բոլոր կենտ էլեմենտները, կենտերի քանակը:
        // մասիվի էլեմենտների գումարը։
        System.out.println();
        for (int a = 0; a < array.length; a++) {
            lastNumber = array[a];

            if (array[a] % 2 != 0) {
                System.out.print(array[a] + ", ");
                oddNumber++;
            }

            arithmeticAverages = arithmeticAverages + array[a];
        }

        // մասիվի բոլոր թվերի միջին թվաբանականի արժեքը
        for (int i = 0; i < array.length / 2; i++) {
            meanNumber = array[i];
        }

        System.out.println();
        System.out.println("number of even numbers = " + evenNumber);
        System.out.println("number of odd numbers = " + oddNumber);
        System.out.println("թվաբանական միջին արժեքը = " + arithmeticAverages / array.length);
        System.out.println("էլեմենտների գումարը = " + arithmeticAverages);
        System.out.println("first number = " + array[0]);
        System.out.println("last number = " + lastNumber);
        System.out.println("մեջտեղի էլեմենտը = " + meanNumber);
    }
}
