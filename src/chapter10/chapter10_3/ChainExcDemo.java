package chapter10.chapter10_3;

public class ChainExcDemo {


    static void demoproc() {

        //  создать исключение (Exception)
        NullPointerException e = new NullPointerException("вepxний уровень");

        //  добавить причину исключения (Exception)
        e.initCause(new ArithmeticException("пpичинa"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Пepexвaчeнo исключение: " + e);

            // вbвести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Пepвoпpичинa: " + e.getCause());
        }
    }
}