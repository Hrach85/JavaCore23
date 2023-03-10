package chapter6.stack;

public class Stack {
    // В этом классе определяется целочисленнbй стек, где
    // можно хранить до 10 целочисленнbх значений
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }
    void push(int item) {
        if (item == 9) {
            System.out.println("Cтeк заполнен. ");
        } else
            stck[++tos] = item;
    }

    int Pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}