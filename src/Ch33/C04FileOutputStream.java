package Ch33;

import java.io.*;

public class C04FileOutputStream {
    static OutputStream out;
    public static void main(String[] args) throws IOException {

        out = new FileOutputStream("c:\\abcd\\C03Test.exe");

        out.write('a');
        out.write('b');
        out.write('c');
        out.write('d');

        out.flush();
        out.close();
    }

}
