package homework.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack st = new Stack();
        int a = 0;

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case ')':
                case '[':
                case ']':
                case '{':
                case '}':
                    st.push(i);
                    a++;
            }
        }
        for (int j = 0; j < a / 2; j++) {
            int i = st.Pop();
            int b = st.Pop();
            switch (text.charAt(i)) {
                case ')':
                    if (text.charAt(b) != '(')
                        System.out.println("Error: opened " + text.charAt(b) + " but closed " + text.charAt(i) + " at " + i);
                    break;
                case ']':
                    if (text.charAt(b) != '[')
                        System.out.println("Error: opened " + text.charAt(b) + " but closed " + text.charAt(i) + " at " + i);
                    break;
                case '}':
                    if (text.charAt(b) != '{')
                        System.out.println("Error: opened " + text.charAt(b) + " but closed " + text.charAt(i) + " at " + i);
                    break;
            }
        }
    }
}




