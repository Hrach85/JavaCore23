package chapter10.chapter10_1;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле " + "метода demoproc () .");

            throw e;  // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Пoвтopный перехват: " + e);
        }
    }
}
