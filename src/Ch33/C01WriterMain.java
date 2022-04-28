package Ch33;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriterMain {

    static Writer out;

    public static void main(String[] args) {
        try {
            //append : true//추가 false//덮어쓰기
            out = new FileWriter("c:\\abcd\\test.txt",true);
            out.write("가나\n");
            out.write("나나\n");
            out.write("다\n");
            out.write("라\n");

            out.flush();    //스트림 버퍼 초기화
            out.close();    //스트림 제거

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
