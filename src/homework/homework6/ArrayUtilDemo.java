package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {6, 4, 85, 68, -2, 45, 26, 47, 7, 20, 77};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenNumberOfArray(array);
        au.oddNumberOfArray(array);
        au.arithmeticAveragesOfArray(array);
    }
}
