package chapter2;

public class Long {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.println("Зa " + days);
        System.out.println(" дней свет пройдет около ");
        System.out.println(distance + "миль. "); // За 1000 дней свет пройдет около 16070400000000 миль.

    }
}
