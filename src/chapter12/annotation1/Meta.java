package chapter12.annotation1;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void muMetod() {
        Meta ob = new Meta();

        // получить аннотацию из метода и вbвести значения ее членов
        try {
            Class<?> c = ob.getClass();

            // сначала получить объект типа Class, представляющий даннbй класс
            Method m = c.getMethod("muMetod");

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // и наконец, вbвести значения членов аннотации
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        muMetod();
    }
}