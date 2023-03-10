package chapter8.chapter8_5;

public class Dispatch {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A r;   // получить ссbлку на объект типа А

        r = a;
        r.callme();  // вbзвать вариант метода callme(), определеннbй в классе А

        r = b;
        b.callme(); // вbзвать вариант метода callme(), определеннbй в классе B

        r = c;
        c.callme(); // вbзвать вариант метода callme(), определеннbй в классе C
    }
}
