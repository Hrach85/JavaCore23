package chapter5;

public class NoBody {
    // Целевая часть цикла может бbть пустой
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // рассчитать среднее значение переменнbх i и j
        while (i++ < j--) ;
        System.out.println("Cpeднee значение равно " + i);
    }
}
