package chapter7.chapter7_4;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a и до вbзова: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a и после вbзова: " + a + " " + b);
    }
}
