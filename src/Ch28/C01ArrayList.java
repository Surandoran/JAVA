package Ch28;

import java.util.*;

public class C01ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*
        list.add(자료형 값); (Integer,Double,String,char값을 넣어주면된다)
        list.add(index, 자료형값); 원하는 index위치에 값을 넣는다
        list.clear(); 배열요소들을 초기화
        list.clone(); 배열을 복사
        list.size(); 배열의 길이를 알수있음.
        list.contains(자료형 값); 배열의 값이 존재하는지 알수있음
        list.get(index); 배열의 index요소를 반환
        list.indexOf(자료형 값); 해당 값이 존재하는 배열의 index위치를 반환
        list.remove(index); 해당 index위치의 값을 배열에서 제거
        list.set(index, 자료형 값); index위치의 값을 해당 값으로 변경
        배열이름.sort(null); list를 오름차순으로 정렬
         */
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
