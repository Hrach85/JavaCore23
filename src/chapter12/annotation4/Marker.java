package chapter12.annotation4;

import java.lang.reflect.Method;

public class Marker {

    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try {
        Method m = ob.getClass().getMethod("myMeth");

        // определить наличие аннотации
        if (m.isAnnotationPresent(MyMarker.class)){
            System.out.println("Маркерная аннотация MyMarker присутствует.");
        }
    } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
