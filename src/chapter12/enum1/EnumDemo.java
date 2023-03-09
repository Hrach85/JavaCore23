package chapter12.enum1;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.REDDEL;
        System.out.println("Знaчeниe ар: " + ap);
        System.out.println();

        ap = Apple.GOLDENDEL;

        if (ap == Apple.GOLDENDEL) {
            System.out.println("Переменная ар содержит GoldenDel.\n");
        }

        switch (ap) {
            case JONATHON:
                System.out.println("Copт Jonathan красный.");
                break;
            case REDDEL:
                System.out.println("Copт Red Delicious красный.");
                break;
            case GOLDENDEL:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case WINESAP:
                System.out.println("Copт Winesap красный.");
                break;
            case CORTlAND:
                System.out.println("Copт Cortland красный.");
        }
    }
}
