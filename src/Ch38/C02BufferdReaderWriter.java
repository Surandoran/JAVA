package Ch38;

import java.io.*;

public class C02BufferdReaderWriter {

    public static void main(String[] args) {
        try {
            Reader in = new FileReader("c:\\abcd\\Dialog.txt"); // 기본스트림
            BufferedReader bin = new BufferedReader(in);                 // 보조스트림

            Writer out = new FileWriter("c:\\abcd\\CopyDL.txt");// 기본스트림
            BufferedWriter bout = new BufferedWriter(out);               // 보조스트림

           int data = 0;
            while (true) {
                data = bin.read();
                if (data == -1)
                    break;
                bout.write(data);
                System.out.print((char) data);
            }
            bout.flush();
            bout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
