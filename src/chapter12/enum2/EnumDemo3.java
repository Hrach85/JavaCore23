package chapter12.enum2;

public class EnumDemo3 {
    public static void main(String[] args) {

        Apple ap;

        // вbвести цену на яблоко сорта Winesap
        System.out.println("Яблoкo сорта Winesap стоит "
                + Apple.WINESAP.getPrice() + " центов.\n");

        // вbвести ценb на все сорта яблок
        System.out.println("Цeнb на все сорта яблок: ");
        for (Apple a : Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов. ");
        }
    }
}
