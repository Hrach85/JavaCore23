package chapter10.chapter10_1;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int а = 0;
            int Ь = 42 / а;
        } catch (Exception e) {
            System.out.println(
                    "Перехват исключений общего класса Exception.");

            /* Этот оператор catch вообще не будет достигнут,
               так как подкласс ArithmeticException является
               производным от класса Exception.
            */

        }// catch (ArithmeticException e) {
        // ОШИБКА: недостижимый код!
        //  System.out.println("Этoт код вообще недостижим.");
        // }
    }
}

/*
  первый оператор catch
  обработает все ошибки, относящиеся к классу Exception, включая и класс
  ArithmeticException. Это означает, что второй оператор catch так и не будет
  выполнен. Чтобы исправить это положение, придется изменить порядок следова
  ния операторов catch.
*/