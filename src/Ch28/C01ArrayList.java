package Ch28;

import java.util.*;

public class C01ArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //추가 0부터 시작~
        list.add("JAVA");
        list.add("JDBC");
        list.add("OracleDB");
        list.add("JSP");
        list.add("Servlet");
        list.add("springFramewWork");
        list.add("JAVA");

        //개수 확인
        System.out.println("총 개체수 : " + list.size());

        //요소 조회
        System.out.println("Index 2번째 문자열 : " + list.get(2));

        //전체 조회
        System.out.println("for문 1번째-------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
        //2)개량 for문
        System.out.println("for문 2번째--------------");
        for (String tmp : list) {
            System.out.print(tmp + ",");
        }
        System.out.println();
        //삭제
        list.remove(1);
        System.out.println("삭제후 확인 1---------------");
        for (String tmp :
                list) {
            System.out.println(tmp);
        }

        list.remove("JSP");
        System.out.println("삭제후 확인 2---------------");
        for (String tmp :
                list) {
            System.out.println(tmp);
        }
        //
        System.out.println(list.toString());
    }
}
