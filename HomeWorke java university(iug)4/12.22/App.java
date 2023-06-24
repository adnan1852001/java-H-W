import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String dirPath = args[0];
        String replaceWith = args[1];
        String replaceTo = args[2];
        File dir = new File(dirPath);
        if (!dir.exists()) {
            System.out.println(dir + " does not exist.");
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println(dir + " is not a directory.");
            return;
        }

        for (File f : dir.listFiles()) {
            replaceWord(f, replaceWith, replaceTo);
        }
    }

    private static void replaceWord(File file, String replaceWith, String replaceTo) {
        String newLine = "\n";
        String content = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                content += input.nextLine() + newLine;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("error in reading file");
        }
        content = content.replaceAll(replaceWith, replaceTo);
        try {
            PrintWriter write = new PrintWriter(file);
            write.write(content);
            write.close();
        } catch (FileNotFoundException ex) {
            System.out.println("error in writing file");
        }

    }
}