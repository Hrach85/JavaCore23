package chapter14.chapter14_7;

public class Gen<T> {
    T ob;

    public Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}
