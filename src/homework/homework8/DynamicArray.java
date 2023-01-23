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
            bigArray[i] = array[i];
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

    public void deleteByIndex(int index) {
        if (index > -1 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
            return;
        }
        System.out.println("there is no such element (չկա նման էլեմենտ),");
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("նման ինդեքսով էլեմենտ չկա,");
            return;
        }
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index > -1 && index < size) {
            size++;
            int lengt = size;
            for (int i = index; i < size; i++) {
                array[lengt] = array[lengt - 1];
                lengt--;
            }
            array[index] = value;
            return;
        }
        System.out.println("նման ինդեքսով էլեմենտ չկա,");
    }

    public boolean exists(int value) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}