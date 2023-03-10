package chapter12.annotation2;

import java.lang.reflect.Method;

public class Meta {
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();

            // Здесь указbваются типb параметров
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }
    public static void main(String args[]) {
        myMeth("Tecт", 10);
    }
}