package Ch33;

import java.io.*;

public class C03WriterReaderMain {

    public static void main(String[] args) throws IOException {

//        try {
            Writer bw = new FileWriter("C:\\abcd\\test.txt"); //기본값은 false 즉 덮어쓰기로 되어있다.
            Reader br = new FileReader("C:\\abcd\\test.txt");
            bw.write("동해물과\t");
            bw.write("백두산이\n");
            bw.write("마르고\t");
            bw.write("닳도록\n");
            bw.write("하느님이\t");
            bw.write("보우하사\n");
            bw.write("우리나라\t");
            bw.write("만세\n");

            bw.flush();
            bw.close();

            while (true) {
                int data = br.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data);
            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

}
