package chapter2;

public class IfSample {

    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x меньше у");

        }
        x = x * 2;
        if (x == y) {
            System.out.println("x теперь равно у");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x теперь больше у");
        }

        // Այստեղ ոչինչ չի ցույց տալու, քանի որ x հավասար չէ  y
        if (x == y) {
            System.out.println("вb не увидите этого");

        }
    }

}
