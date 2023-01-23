package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            dy.add(i + 5);
        }

        dy.print();
        System.out.println();

        dy.deleteByIndex(24);
        dy.set(23, 10);
        dy.add(3, 80);
        System.out.println(dy.exists(7));
        System.out.println(dy.getIndexByValue(10));

        dy.print();
    }
}
