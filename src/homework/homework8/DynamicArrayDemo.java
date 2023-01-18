package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        for (int i = 0; i < 25; i++) {
            dy.add(i + 5);
        }
        dy.add(14);
        dy.add(18);
        dy.add(15);

        System.out.println(dy.getByIndex(26));
        System.out.println(dy.getByIndex(27));
        System.out.println(dy.getByIndex(28));
        System.out.println(dy.getByIndex(29));

        dy.print();
    }
}
