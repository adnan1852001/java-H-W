import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class App {

    public static void main(String[] args) {
        System.out.println("every { or } should in the line alone");
        File file = new File(args[0]);
        StringBuilder content = new StringBuilder();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String s = input.nextLine();

                if (s.contains("{")) {
                    content.append(" {");
                } else {
                    content.append("\n" + s);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("404 file not found");
        }

        try {
            PrintWriter output = new PrintWriter(file);
            output.write(content.toString());
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("404 file not found");
        }
    }
}