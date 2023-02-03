package chapter8.chapter8_2;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeigh myBox1 = new BoxWeigh(10, 20, 15, 34.3);
        BoxWeigh myBox2 = new BoxWeigh(2, 3, 4, 0.76);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 раве " + myBox2.weight);
    }
}
