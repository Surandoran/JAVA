package Ch25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C08StringBufferMain {

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String r = br.readLine();
//        String s = br.readLine();

//        bw.write(r);
//        bw.write(s);

//        String str1 = "JAVA";
//        String str2 = "Android";
//        br.close();
//        bw.flush();
//        bw.close();
//        System.out.println(str1);
//        System.out.printf("%x\n",System.identityHashCode(str1));
//
//        str1 = str1.concat(str2); // 덧붙이기
//
//        System.out.println();
//        System.out.println(str1);
//        System.out.printf("%x\n",System.identityHashCode(str1));

        StringBuffer str1 = new StringBuffer("JAVA");
        System.out.printf("%x\n",System.identityHashCode(str1));
        System.out.println(str1);
        System.out.println();

        str1.append(" and ");
        str1.append(" Android ");
        System.out.printf("%x\n",System.identityHashCode(str1));
        System.out.println(str1);
    }

}
