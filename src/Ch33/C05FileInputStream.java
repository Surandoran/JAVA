package Ch33;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C05FileInputStream {
    static InputStream in;
    public static void main(String[] args) throws IOException {
        in = Files.newInputStream(Paths.get("c:\\abcd\\C03Test.exe"));

        while (true) {
            int data = in.read();
            if(data == -1){
                break;
            }
            System.out.print((char)data);
        }
    }

}
