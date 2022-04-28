package Ch33;

import java.io.FileReader;
import java.io.Reader;

import static java.lang.System.in;

public class C02ReaderMain {
    static Reader read;

    public static void main(String[] args) {
        try {
            Reader in = new FileReader("C:\\abcd\\test.txt"); //읽어올 파일이 있는경로
            while (true){
                int data = in.read();
                if(data == -1){ //만약 데이터가 -1이라면 더이상 읽을게 없기때문에 반복문을 벗어난다
                    break;
                }
                System.out.print((char) data); //데이터를 차형으로 읽어온다
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
