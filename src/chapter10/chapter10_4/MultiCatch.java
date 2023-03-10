package chapter10.chapter10_4;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] ={1,2,3,};
        try {
            int result = a/b;

            // сгенерировать исключение
            // типа ArithmeticException
            // vals[1O] = 19; //сгенерировать исключение
            // типа ArrayindexOutOfBoundsException
            // В этом операторе catch перехватbваются
            // оба исключения
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Иcключeниe перехвачено: " + e);
        }
        System.out.println("Пocлe многократного перехвата.");
    }
}
