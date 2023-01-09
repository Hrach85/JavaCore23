package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {

        // 1. կհաշվի թե քանի հատ կա
        // c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char c = 'o';
        int quantity = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                quantity++;
            }
        }
        System.out.println("c quantity = " + quantity);


        // 2. գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'y', 'e'};
        System.out.println("middle 2 element = " + chars2[chars2.length / 2 - 1] + "," + chars2[chars2.length / 2]);


        // 3. պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean a;
        if (a = chars3[chars3.length - 1 - 1] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(a);


            // 4. տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
            for (int i = 0; i < text.length; i++) {
                if (text[i] != ' ') {
                    System.out.print(text[i]);
                }
            }
        }
    }
}