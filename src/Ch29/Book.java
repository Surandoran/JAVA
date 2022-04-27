package Ch29;

import java.security.Key;
import java.util.*;

public class Book implements Service {
    String name; //도서
    int number; //도서수량
    Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new HashMap();

    //등록
    public void Insert() {
        System.out.print("도서 등록 : ");
        name = sc.next();
        if (!map.containsKey(name)) {
            System.out.print("도서 개수 : ");
            number = sc.nextInt();
            map.put(name, number);
            System.out.println("현재 " + name + "은 " + number + " 권 있습니다.");
        } else if (map.containsKey(name)) {
            System.out.print("추가할 도서 개수 : ");
            int num;
            num = sc.nextInt();
            number = number + num;
            map.put(name, number);
            System.out.println("현재 " + name + "은 " + number + " 권 있습니다.");
        }
    }

    //수정
    public void Update() {
        System.out.println("1.도서이름변경");
        System.out.println("2.도서수량변경");
        int num = sc.nextInt();
        switch (num){
            case 1 :
                System.out.print("도서 이름 입력 : ");
                name = sc.next();
                if (map.containsKey(name)){
                    map.remove(name);
                    System.out.print("변경할 도서 이름 입력 : ");
                    name = sc.next();
                    System.out.print("변경할 도서 수량 입력 : ");
                    number = sc.nextInt();
                    map.put(name,number);
                    System.out.println(name + "이" + number + "권 으로 등록되었습니다.");
                }
            case 2 :
                System.out.print("도서 이름 입력 : ");
                name = sc.next();
                if(map.containsKey(name)) {
                    System.out.print("변경할 수량 입력 : ");
                    number = sc.nextInt();
                    int Newnumber = map.replace(name, number);
                    System.out.println("도서이름 : " + name + "\n" +  "수량 : " + Newnumber);
                }
                break;
        }
    }
    //조회
    public void inquiry(){
        Set<String> Set = map.keySet();
        for (String key : Set) {
            System.out.println("도서명 : " + key + " : " + "권수 : " + map.get(key));
        }

    }

    //삭제
    public void Delete() {
        System.out.println("도서 삭제");
    }
}
