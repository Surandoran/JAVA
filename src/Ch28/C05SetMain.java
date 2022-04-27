package Ch28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C05SetMain {

    public static void main(String[] args) {
        Set<String> set = new HashSet();

        set.add("JAVA");
        set.add("Android");
        set.add("JSP");
        set.add("OracleDB");
        set.add("SpringFramework");
        set.add("JAVA");        //중복허용 x

        //길이확인
        System.out.println("사이즈 : " + set.size());

        //조회
        System.out.println("값확인 : " + set.toString());
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){ //iter.hasNext() : 다음위치에 요소가 존재하는지 확인
            System.out.print(iter.next() + " | ");    //해당 위치의 요소를 꺼냄
        }

        set.remove("JAVA");

        set.clear();
    }

}
