package chapter14.chapter14_1;

public class Gen<T> {
    T ob;

    public Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tипoм Т является " + ob.getClass().getName());
    }
}
