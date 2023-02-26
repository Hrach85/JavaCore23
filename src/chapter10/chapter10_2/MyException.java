package chapter10.chapter10_2;

public class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "MyException [ + detail + ] ";
    }
}
