package Ch33;

import java.io.*;

public class C06FileCopy {
    static InputStream in;
    static OutputStream out;
    public static void main(String[] args) throws IOException {
        in = new FileInputStream("c:\\abcd\\Origin.jpg");
        out = new FileOutputStream("c:\\abcd\\Copy.jpg");

        byte[] buffer = new byte[4096]; //4Kbyte 단위로 수신

        while (true){
            int data = in.read(buffer);
            if(data == -1){
                break;
            }
            out.write(buffer,0,data);   //buffer에 저장된배열을 index 0부터 배열의 끝까지 출력
            out.flush();
        }
        out.close();
        in.close();
    }

}
