package chapter8.chapter8_1;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb: ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ ко всем открbтbм членам
           своего суперкласса.*/
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Coдepжимoe объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Cyммa i, и k b объекте subOb ");
        subOb.sum();
    }
}
