package Ch38;

import java.io.*;

public class C01BufferedSubMain {

    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("c:\\abcd\\스노우뱅갈.jpg");
            OutputStream out = new FileOutputStream("c:\\abcd\\스노우뱅갈카피.jpg");
            long time = copyTimer(in, out);

            System.out.println("기본스트링 복사 시간 : " + time);

            //보조스트림 추가후(버퍼스트림 소요시간 확인)
            InputStream in2 = new FileInputStream("c:\\abcd\\스노우뱅갈.jpg");
            OutputStream out2 = new FileOutputStream("c:\\abcd\\스노우뱅갈.jpg");
            //기본스트림에 보조스트림 추가
            BufferedInputStream bin = new BufferedInputStream(in2);
            BufferedOutputStream bout = new BufferedOutputStream(out2);

            long time2 = copyTimer(bin,bout);
            System.out.println("보조스트림 복사 시간 : " + time2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //파일복수 함수
    public static long copyTimer(InputStream in, OutputStream out) throws IOException {
        long start = System.nanoTime();

        //파일복사
        int data = 0;
        while (true) {
            data = in.read(); // -1 : EOF (더이상 읽을게 없다)
            if (data == -1) {
                break;
            }
            out.write(data);
        }
        out.flush();
        out.close();


        long end = System.nanoTime();

        return end - start;
    }


}
