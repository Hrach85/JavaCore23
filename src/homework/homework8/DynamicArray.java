package homework.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] bigArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = bigArray[i];
        }
        array = bigArray;
    }

    public int getByIndex(int index) {
        if (index > -1 && index < size) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
