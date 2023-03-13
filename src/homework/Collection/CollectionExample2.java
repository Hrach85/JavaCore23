package homework.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task 2.1
        System.out.println("please enter 5 names: the following formats < name,name,name... > :");
        String names0 = scanner.nextLine();
        try {
            String[] name = names0.split(",");
            HashSet<String> names = new HashSet<>();
            names.add(name[0]);
            names.add(name[1]);
            names.add(name[2]);
            names.add(name[3]);
            names.add(name[4]);
            System.out.println("added  " + names.size() + " unique names " + names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the names have not increased: " +
                    "please enter the correct formats < name,name,name... > :");
        }

        // task 2.2
        System.out.println("Please enter 10 names, the following formats < name,name,name... > :");
        String namess = scanner.nextLine();
        String[] names1 = namess.split(",");
        Arrays.sort(names1, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted names ");
        for (String name2 : names1) {
            System.out.println(name2);
        }
    }
}