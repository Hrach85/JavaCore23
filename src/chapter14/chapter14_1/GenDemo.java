package chapter14.chapter14_1;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;

        iob = new Gen<>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new  Gen<>("Тест обобщений");

        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Знaчeниe: " + str);
    }
}
