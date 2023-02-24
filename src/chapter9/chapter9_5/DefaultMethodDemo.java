package chapter9.chapter9_5;

public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFimp obj = new MyIFimp();
        // Метод getNumЬer() можно вызвать, так как он
        // явно реализован в классе MyIFimp:
        System.out.println(obj.getNumЬer());

        // Метод getString() также можно вызвать,
        // так как в интерфейсе имеется его реализация
        // по умолчанию:
        System.out.println(obj.getString());
    }
}
