import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class App {
    public static void main(String[] args) throws Exception {
        File[] splitFiles = new File[args.length - 1];

        for (int i = 0; i < splitFiles.length; i++)
            splitFiles[i] = new File(args[i]);

        File targetFile = new File(args[args.length - 1]);

        try {
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile))) {
                int buffer;
                for (File f : splitFiles) {
                    if (!f.isFile()) {
                        throw new FileNotFoundException(f.getAbsolutePath() + " file not found.");
                    }
                    BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
                    while ((buffer = in.read()) != -1)
                        out.write(buffer);
                    in.close();
                }
                out.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}