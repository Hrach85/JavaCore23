package chapter10.chapter10_1;

public class Exc1 {
   static void subroutine() {
       int d = 0;
       int a = 10 / d;
   }

    public static void main(String[] args) {
        Exc1.subroutine();
    }

    // Результат трассировки стека стандартного обработчика исключений отображает
    // весь стек вызовов следующим образом:

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at chapter10.chapter10_1.Exc1.subroutine(Exc1.java:6)
    //	at chapter10.chapter10_1.Exc1.main(Exc1.java:10)
}
