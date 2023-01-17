package chapter6.chapter6_2;

public class BoxDemo7 {
    /* В данном примере программы для
    инициализации размеров параллелепипеда в классе
    Вох применяется параметризированный конструктор
    */
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        //олучить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Oбъeм равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
