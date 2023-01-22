package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            dy.add(i + 5);
        }
        dy.add(8);
        System.out.println(dy.getByIndex(21));

        dy.deleteByIndex(5);
        dy.deleteByIndex(-4);
        dy.deleteByIndex(40);
        dy.print();
        System.out.println();

        dy.set(45, 20);

        dy.add(3,5);

        System.out.println(dy.exists(20));

        System.out.println(dy.getIndexByValue(8));
        dy.print();
    }
}
