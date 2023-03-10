package chapter8.chapter8_3;

public class B extends A {
    int i;    // этот член i скрbвает член i из класса А

    B(int a, int b) {
        super.i = a;  // член i из класса А
        i = b;        // член i из класса В
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе:  " + i);
    }
}
