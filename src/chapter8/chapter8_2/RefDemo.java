package chapter8.chapter8_2;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeigh weighBox = new BoxWeigh(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weighBox.volume();
        System.out.println("Oбъeм weightbox равен " + vol);
        System.out.println("вec weightbox равен  " + weighBox.width);

        System.out.println();

        // присвоить переменной ссbлки на объект типа BoxWeight
        // ссbлку на объект типа Вох

        plainBox = weighBox;
        vol = plainBox.volume();
        System.out.println("Oбъeм plainbox равен " + vol);

    }
}
