package test;

//다음 Cal 클래스를 Singleton 패턴코드를 삽입하세요.
//멤버변수 arr배열을 ArrayList 로 변경처리해보세요.
//(참조변수명은 임의로 지정합니다)
//ShowVal() 멤버 함수의 코드를 ArrayList에 맞게 변경해보세요

import java.sql.Array;
import java.util.*;

class Cal {
    //멤버변수(arr[] -> ArrayList로 변경! , index는 삭제)

    ArrayList<Integer> arr = new ArrayList<>();

    //싱글톤 패턴 코드 삽입!
    private static Cal instance = new Cal();

    private Cal() {
    }

    public static Cal getInstance() {
        if (instance == null) {
            instance = new Cal();
        }
        return instance;
    }

    public int InsertVal(int tmp) {
        try {
            arr.add(tmp);
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // 저장된 값 확인(ArrayList 에 맞게 변경하기)
    public void ShowVal() {
        System.out.println("-------조회-------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }


}

public class test {

    public static void main(String[] args) {

        Cal cal = Cal.getInstance();

        for (int i = 1; i <= 100; i++) {

            cal.InsertVal(i);

        }

        cal.ShowVal();
    }


}
