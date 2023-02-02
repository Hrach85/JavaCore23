package chapter7.chapter9_1_3;

public class PassArray {

    static void vaTest(int v[]) {
        System.out.println("Koличecтвo аргументов: " + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1,2,3};
        int n3[] = {};

        vaTest(n1); // 1 аргументов
        vaTest(n2); // 2 аргументов
        vaTest(n3); // без аргументов
    }
}
