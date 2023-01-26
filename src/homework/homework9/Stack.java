package homework.homework9;

public class Stack {

    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            int[] bigArray = new int[stck.length + 10];
            for (int i = 0; i < stck.length; i++) {
                bigArray[i] = stck[i];
            }
            stck = bigArray;
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

