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
        int replenish;
        for (int i = 0; i < array.length; i++) {
            replenish = array[i];
            bigArray[i] = replenish;
        }
        array = bigArray;
    }

    public int getByIndex(int index) {
        if (index > -1 && index < array.length && index < size) {
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
