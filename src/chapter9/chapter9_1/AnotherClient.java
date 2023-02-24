package chapter9.chapter9_1;

public class AnotherClient implements Callback{
    @Override
    public void callback(int param) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("param в квадрате равно " + (param*param));
    }
}
