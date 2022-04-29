package Ch38;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class C04URLStreamMain {

    public static void main(String[] args) {

        try{
            URL url = new URL("https://www.naver.com");
            InputStream in = url.openStream();  //지정된 URL로부터 inputStream 가져옴
            in = new BufferedInputStream(in);   //기본 스트림에 Buffer스트림 연결
            Reader r = new InputStreamReader(in); // Buffer연결된 스트림에 Reader스트림연결

            int data = 0;
            while (true){
                data = r.read();
                if(data == -1)
                    break;
                System.out.print((char) data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
