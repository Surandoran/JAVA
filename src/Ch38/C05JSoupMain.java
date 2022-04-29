package Ch38;

import java.io.*;
import java.net.URL;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C05JSoupMain {

    public static void main(String[] args) {
        try{

            Connection conn = Jsoup.connect("https://www.naver.com");
            Document document = conn.get();
//            System.out.print(document);

            URL url = null;

            Elements elements = document.getElementsByTag("img");

            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).toString().contains("http")) {
                    String str[] = elements.get(i).toString().split(" ");
//                System.out.println(i + "번째 : " + str[1]);
                    int EndIdx = str[1].indexOf("\"") + 1;
//                System.out.println("\"의 idx : " + EndIdx);
//                System.out.println();
                    String tmp = str[1].substring(EndIdx, str[1].length() - 1);
                    System.out.println(tmp);

                    //URL 연결하기
                    url = new URL(tmp.toString());
                    InputStream in = url.openStream();
                    BufferedInputStream bin = new BufferedInputStream(in);
                    String filename = "Image";
                    OutputStream out = new FileOutputStream("c:\\abcd\\" + filename + i + ".png");
                    int data = 0;
                    while (true) {
                        data = bin.read();
                        if (data == -1)
                            break;
                        out.write(data);
                        out.flush();
                    }

                }// if
            }// for
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
