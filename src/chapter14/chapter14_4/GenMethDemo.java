package chapter14.chapter14_4;


public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isin(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isin(2, nums)) {
            System.out.println("Чиcлo 2 содержится в массиве nums");
        }
        if (!isin(7, nums)) {
            System.out.println("Чиcлo 7 отсутствует в массиве nums");
        }
        System.out.println();


        String strs[] = {"один", "два", "три", "четыре", "пять"};

        if (isin("двa", strs)) {
            System.out.println("два содержится в массиве strs");
        }
        if (!isin("ceмь", strs))
            System.out.println("ceмь отсутствует в массиве strs");
    }
}