package chapter12.enum1;

public class EnumDemo2 {
    public static void main(String[] args) {

        Apple ap;

        System.out.println("Константb перечислимого типа Apple");

        //  применить метод values()
        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }
        System.out.println();

        // применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);


        System.out.println();
        //for можно написать и без переменной allapples следующим образом:
        System.out.println("без переменной allapples следующим образом:");
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
    }
}
