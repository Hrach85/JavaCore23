package chapter12.enum1;

public class EnumDemo4 {
    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        System.out.println("Bce константb сортов яблок " + " и их порядковbе значения:");


        // получить все порядковbе значения с помощью метода ordinal()
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple.REDDEL;
        ap2 = Apple.GOLDENDEL;
        ap3 = Apple.REDDEL;

        System.out.println();

        // продемонстрировать применение методов compareTo() и equals()
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " предшествуе " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " предшествуе " + ap);
        }
        if (ap.compareTo(ap2) == 0) {
            System.out.println(ap + " равно " + ap3);
        }

        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Oшибкa!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " равно " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
