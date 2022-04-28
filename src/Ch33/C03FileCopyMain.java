package Ch33;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {
    static Writer bw;
    static Reader br;
    public static void main(String[] args) {
        try{
            br = new FileReader("c:\\abcd\\Original.txt");
            bw = new FileWriter("c:\\abcd\\CopyFile.txt",true);

            //읽을 때 사용하는 버퍼 공간
            char buffer[] = new char[4096]; //받을 글자 개수

            while(true) {
                int num = br.read(buffer);
                if (num == -1) {        //값이 없다면 와일문종료
                    break;
                }
                bw.write(buffer);       //지정된 위치에 쓰기
                bw.flush();             //지정된 위치에 저장한 파일을 밀어낸다
                bw.close();             //닫기
                System.out.println("받은 문자개수 : " + num);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
