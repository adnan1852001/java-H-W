import java.io.File;
import java.io.IOException;

class App {
    public static void main(String[] args) {

        File file = new File("Exercise17_17.dat");
        String bits = "010000100100001001101";

        try {
            BitOutputStream out = new BitOutputStream(file);
            out.writeBit(bits);
        } catch (IOException ex) {
            System.out.println("error in creating file");
        }
    }
}