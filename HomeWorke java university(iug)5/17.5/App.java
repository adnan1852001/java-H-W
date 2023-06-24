import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

class App {
    public static void main(String[] args) throws IOException {

        FileOutputStream fOutputStream = new FileOutputStream("Exercise17_05.dat");
        ObjectOutputStream out = new ObjectOutputStream(fOutputStream);
        out.writeObject(new int[] { 1, 2, 3, 4, 5, 6 });
        out.writeObject(new Date());
        out.writeDouble(10.5);
    }
}