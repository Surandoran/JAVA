package Ch38;

import java.io.*;

public class C03OutputStreamWriter {

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("c:\\abcd\\tmp.exe");
        OutputStreamWriter wout = new OutputStreamWriter(out);

        InputStream in = new FileInputStream("c:\\abcd\\tmp.exe");
        InputStreamReader ir = new InputStreamReader(in);

        while (true){
            int data = ir.read();
            if(data == -1){
                break;
            }
            System.out.println((char) data);
        }
    }

}
