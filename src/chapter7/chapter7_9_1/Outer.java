package chapter7.chapter7_9_1;

public class Outer {
    int outer_x = 100;

    void Test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("вbвoд: outer_x = " + outer_x);
        }
    }
}
