package chapter12.integer1;

public class AutoBox4 {

    public static void main(String args[]) {
        Integer iob = 100;
        Double dob = 98.6;

        dob = dob + iob;
        System.out.println("dOb после вbражения: " + dob);
    }
}