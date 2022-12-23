package homework.homework1;

public class IfForExample {

    public static void main(String[] args) {

        int a, b;
        a = 71;
        b = 77;


        // 1.
        if (a > b) {
            System.out.println("max: " + a);
        }

        if (b > a) {
            System.out.println("max: " + b);
        }


        // 2.
        for (int x = a; a <= b; a++) {
            System.out.println(a);
        }


        // 3.
        System.out.println((char) a);
        System.out.println((char) b);

        // 3. Example2
        char ch1, ch2;
        ch1 = (char) a;
        ch2 = (char) b;
        System.out.println(ch1);
        System.out.println(ch2);


        // 4.
        if (a == b) {
            System.out.println("a հավասար է b-ին");
        }
        if (a != b) {
            System.out.println("a հավասար չէ b-ին");
        }
    }
}