package Ch33;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01ReaderTest {

    static Writer bw;
    static Reader br;

    public static void main(String[] args) {

        try{
            Date tmp1 = new Date();
            SimpleDateFormat test = new SimpleDateFormat("YYYY-MM-dd");
            String str = test.format(tmp1);
            System.out.println(str);
            File tmp2 =new File("c:\\abcd\\");
            if(!tmp2.exists()){
                tmp2.mkdir();
            }
            bw = new FileWriter(tmp2 + "\\test.txt");
            bw.write("HAHAHA\n");
            bw.write("HAHAHA\n");
            bw.write("HAHAHA\n");
            bw.write("HAHAHA\n");

            br = new FileReader(tmp2 + "\\test.txt");

            while(true) {
                int data = br.read();
                if(data == 1) {
                    break;
                }
                System.out.print((char) + data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
