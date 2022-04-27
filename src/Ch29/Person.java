package Ch29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Person implements Service{
    String name; //회원명
    String phone; //휴대폰번호
    Scanner sc = new Scanner(System.in);
    Map<String, String> map = new HashMap();

    //등록
    @Override
    public void Insert() {
        System.out.print("회원 이름 : ");
        name = sc.next();
        if (!map.containsKey(name)) {
            System.out.print("회원 이름 : ");
            phone = sc.next();
            map.put(name, phone);
            System.out.println("현재 " + name + "의 번호 : " + phone + "입니다.");
        }
    }
    //수정
    @Override
    public void Update(){
            System.out.println("1.회원이름변경");
            System.out.println("2.회원번호변경");
            int num = sc.nextInt();
            switch (num){
                case 1 :
                    System.out.print("회원 이름 입력 : ");
                    name = sc.next();
                    if (map.containsKey(name)){
                        map.remove(name);
                        System.out.print("변경할 회원 이름 입력 : ");
                        name = sc.next();
                        System.out.print("변경한 회원 번호 입력 : ");
                        phone = sc.next();
                        map.put(name,phone);
                        System.out.println(name + "의 번호가 " + phone + " 으로 등록되었습니다.");
                    }
                case 2 :
                    System.out.print("회원 이름 입력 : ");
                    name = sc.next();
                    if(map.containsKey(name)) {
                        System.out.print("변경할 번호 입력 : ");
                        phone = sc.next();
                        String Newphone = map.replace(name, phone);
                        System.out.println("회원의 이름은 " + name + "으로 등록 되었습니다.\n" +  "번호는 : " + Newphone);
                    }
                    break;
            }
    }

    //조회
    @Override
    public void inquiry(){
            Set<String> Set = map.keySet();
            for (String key : Set) {
                System.out.println("회원명 : " + key + " : " + "번호 : " + map.get(key));
            }

        }
    //삭제
    @Override
    public void Delete(){
            map.remove(name);
            System.out.println("삭제 목록 : " + map.toString());
    }
}
