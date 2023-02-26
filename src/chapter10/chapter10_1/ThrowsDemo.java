package chapter10.chapter10_1;

public class ThrowsDemo {
     static void throwONe() throws IllegalAccessException {
         System.out.println("B теле метода throwOne() .");
         throw new IllegalAccessException("дeмoнcтpaция");
    }

    public static void main(String[] args) {
        try {
            throwONe();
        }catch (IllegalAccessException e) {
            System.out.println("Пepexвaчeнo исключение: " + e);
        }
    }
}
