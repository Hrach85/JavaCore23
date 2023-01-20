package chapter7.chapter7_6;

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("oЬ1.a " + ob1.a);
        System.out.println("oЬ2.a " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("оЬ2.а после второго увеличения значения: " + ob2.a);
    }
}
