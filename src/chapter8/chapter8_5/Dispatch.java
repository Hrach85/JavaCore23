package chapter8.chapter8_5;

public class Dispatch {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A r;   // получить ссылку на объект типа А

        r = a;
        r.callme();  // вызвать вариант метода callme(), определенный в классе А

        r = b;
        b.callme(); // вызвать вариант метода callme(), определенный в классе B

        r = c;
        c.callme(); // вызвать вариант метода callme(), определенный в классе C
    }
}
