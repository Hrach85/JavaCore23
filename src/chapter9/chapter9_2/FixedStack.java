package chapter9.chapter9_2;

public class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стеке
    public void push(int item) {
        if (tos == stck.length - 1)    // использовать поле длинb стека
            System.out.println("Cтeк заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}