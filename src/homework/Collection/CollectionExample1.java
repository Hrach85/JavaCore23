package homework.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("narek");
        names.add("artur");
        names.add("manvel");
        names.add("gexam");
        names.add("hrant");

        // task 1
        System.out.println("please enter a name to check if there is a name in the list");
        String name = scanner.nextLine();

        if (names.contains(name)) {
            System.out.println(name + " the name is included in the list");
        } else {
            System.out.println(name + " the name is NOT included in the list");
        }

        // task 2
        System.out.println("please enter a name, and if it is in the list, it will be deleted");
        String name1 = scanner.nextLine();
        if (names.contains(name1)) {
            names.remove(name1);
            System.out.println(name1 + " name removed from the list");
        } else {
            System.out.println(name1 + " there is no name in the list");
        }
        for (String s : names) {
            System.out.println(s);
        }

        // task 3
        System.out.println("to add a name, please enter the following name with the <name,index number>");
        String name2 = scanner.nextLine();
        try {
            String[] data = name2.split(",");
            String data1, data2;
            data1 = data[0];
            data2 = data[1];
            int index = Integer.parseInt(data2);
            names.add(index, data1);
            System.out.println(data1 + " name added to this index " + data2);
            for (String n : names) {
                System.out.println(n);
            }
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("please enter the correct data in the following formatov <<name,index number>>");
        }
    }
}