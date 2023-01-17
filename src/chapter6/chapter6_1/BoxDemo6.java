package chapter6.chapter6_1;

public class BoxDemo6 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать
        //объекты типа Вох
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
