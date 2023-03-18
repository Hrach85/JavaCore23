package homework.fileutil;


import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // fileSearch();
        // contentSearch();
        // findLines();
        // printSizeOfPackage();
        createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("please enter the path to the folder, format < C:\\Users\\Admin\\....>");
        String path = scanner.nextLine();
        System.out.println(" please enter the file Name, format < example.txt >");
        String fileName = scanner.nextLine();
        File file = new File(path);
        File[] folderList = file.listFiles();
        boolean fileF = false;
        for (File fileNames : folderList) {
            if (fileNames.getName().contains(fileName)) {
                fileF = true;
            }
        }
        System.out.println(fileF);
    }

    static void contentSearch() {
        System.out.println("please enter the path to the folder, format < C:\\Users\\Admin\\....>");
        String path = scanner.nextLine();
        System.out.println(" please enter the keyword: ");
        String keyword = scanner.nextLine();
        File file = new File(path);
        String[] files = file.list();
        for (String file1 : files) {
            if (file1.endsWith(".txt") && file1.contains(keyword)) {
                System.out.println(file1);
            }
        }
    }

    static void findLines() {
        System.out.println("please enter the path to the file, format < C:\\Users\\Admin\\...\\file.txt >");
        String path = scanner.nextLine();
        System.out.println(" please enter the keyword: ");
        String keyword = scanner.nextLine();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage() {
        System.out.println("please enter the path to the folder, format < C:\\Users\\Admin\\....>");
        String path = scanner.nextLine();
        long byteSize = 0;
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            long length = file1.length();
            byteSize += length;
        }
        System.out.println(byteSize + " byte");
    }

    static void createFileWithContent() {
        System.out.println("please enter the path to the folder, format < C:\\Users\\Admin\\....>");
        String path = scanner.nextLine();
        System.out.println("please write the file name with which the file will be created");
        String fileName = scanner.nextLine();
        System.out.println("please write here what will be requested in the file");
        String content = scanner.nextLine();
        path = path + File.separator + fileName;
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(path))) {
            out.writeUTF(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}