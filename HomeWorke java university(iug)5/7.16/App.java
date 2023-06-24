import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class App {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the path of the file: ");
        File f = new File(new Scanner(System.in).nextLine());

        int[] ascii = new int[128];
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {
            int buffer;
            while ((buffer = in.read()) != -1) {
                ascii[buffer]++;
            }
        }

        System.out.printf("%10s %10s %10s\n", "the char", "code", "number");
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0) {
                System.out.printf("%10c %10d %10d\n", i, ascii[i], i);
            }
        }
    }
}