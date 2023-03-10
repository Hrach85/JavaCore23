package chapter12.integer1;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iob, iob2;
        int i;

        iob = 100;
        System.out.println("Исходное значение iOb: " + iob);

        ++iob;
        System.out.println("Пocлe ++iOb: " + iob);

        iob2 = iob + (iob / 3);
        System.out.println("Ob2 после вbражения: " + iob2);

        i = iob + (iob / 3);
        System.out.println("i после вbражения: " + i);
    }
}
