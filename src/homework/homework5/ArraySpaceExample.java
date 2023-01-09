package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ',};
        int emptySpace = 0;
        int endSpace = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                emptySpace++;
            } else
                break;
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                endSpace++;
            } else
                break;
        }
        int newArraySize = spaceArray.length - (emptySpace + endSpace);
        char[] result = new char[newArraySize];
        for (int i = 0; i < result.length; i++) {
            result[i] = spaceArray[i + emptySpace];
            System.out.print(result[i]);
        }
    }
}