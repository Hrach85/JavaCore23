package homework.homework5;

import javax.swing.*;

public class ArraySort {
    public static void main(String[] args) {

        // գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        int growing;
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[j - 1]) {
                    growing = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = growing;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //գրենք կոդ, որը մասիվի էլեմենտները կդասավորի նվազման կարգով ։
        int downward;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    downward = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = downward;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}