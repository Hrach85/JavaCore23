package chapter7.chapter9_1_3;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длинb: ", 10);
        vaTest("Tpи параметр переменной длинb: ", 1, 2, 3);
        vaTest("Без параметр переменной длинb: ");
    }
}
