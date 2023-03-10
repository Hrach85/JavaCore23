package chapter14.chapter14_7;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<>("Значение равно: ", 99);

        System.out.println(x.getob());
        System.out.println(x.getob2());
    }
}
