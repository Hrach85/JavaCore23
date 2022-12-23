package chapter3;

public class CharDemo2 {

    public static void main(String[] args) {

        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит " + ch1);

        ch1++;   // величить на единицу значение переменной ch1
        System.out.println(" ch1 теперь содержит " + ch1);


        System.out.println("\nalphabet/алфавит");
        ch1 = 64;  //  (код символа A)
        for (int x = 0; x < 26; x++) {
            ch1++;
            System.out.println(ch1);  // алфавит


        }
    }
}
