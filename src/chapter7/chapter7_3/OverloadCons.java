package chapter7.chapter7_3;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("Объем myboxl равен " + vol);

        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        vol = myBox3.volume();
        System.out.println("Oбъeм mybox3 равен " + vol);
    }
}
