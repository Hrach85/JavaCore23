package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker bc = new BraceChecker("hello { ]to {java] d(evel)opers [all) over th(e worl}d");
        bc.check();
    }
}