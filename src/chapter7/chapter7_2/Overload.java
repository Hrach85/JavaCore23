package chapter7.chapter7_2;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);  // здесь вызывается вариант тода test(douЬle)
        ob.test(123.25);  // здесь вызывается вариант тода test(douЬle)
    }
}