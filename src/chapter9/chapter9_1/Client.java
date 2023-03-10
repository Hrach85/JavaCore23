package chapter9.chapter9_1;


public class Client implements Callback{
    @Override
    public void callback(int param) {
        System.out.println("Meтoд callback()," + " вbзbваемbй со значением • " + param);
    }

    void noniFaceMeth(){
        System.out.println("B классах, реализующих интерфейсb," + "могут определяться и другие членb.");
    }
}
