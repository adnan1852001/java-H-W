import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitOutputStream {

    FileOutputStream fileOutput;
    int bits;
    int bitBus;

    public BitOutputStream(File file) throws IOException {
        fileOutput = new FileOutputStream(file);
    }

    public void writeBit(char bit) throws IOException {
        // the << arrow is for shifting the bit to the left
        bits = bits << 1;

        if (bit == '1') {
            bits = bits | 1;
        }

        if (++bitBus == 8) {
            fileOutput.write(bits);
            bitBus = 0;
        }

    }

    public void writeBit(String bit) throws IOException {
        for (char c : bit.toCharArray()) {
            writeBit(c);
        }
    }

    public void close() throws IOException {
        if (bitBus > 0) {
            bits = bits << 8 - bitBus;
            fileOutput.write(bits);
        }
        fileOutput.close();

    }

}