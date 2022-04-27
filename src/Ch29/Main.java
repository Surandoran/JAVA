package Ch29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Service> map = new HashMap();

        Book B = new Book();
        Person P = new Person();
        int num; //메뉴번호

        map.put("도서관리서비스", new Book());
        map.put("회원관리서비스", new Person());

        while (true) {
            System.out.println("1.도서관리서비스");
            System.out.println("2.회원관리서비스");
            System.out.println("3.종료");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    while (true) {
                        System.out.println("1. 도서등록");
                        System.out.println("2. 도서수정");
                        System.out.println("3. 전체조회");
                        System.out.println("4. 도서삭제");
                        num = sc.nextInt();
                        Service sv = map.get(Service.map);
                        if(num == 1){
                            B.Insert();
                        }else if(num == 2){
                            B.Update();
                        }else if(num == 3) {
                            B.inquiry();
                        }else{
                            B.Delete();
                        }
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("1. 회원등록");
                        System.out.println("2. 회원수정");
                        System.out.println("3. 회원조회");
                        System.out.println("4. 회원삭제");
                        num = sc.nextInt();
                        Service sv = map.get("회원관리");
                        if(num == 1){
                            P.Insert();
                        }else if(num == 2){
                            P.Update();
                        }else if(num == 3){
                            P.inquiry();
                        }else {
                            P.Delete();
                        }
                        break;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("그런 메뉴는 없습니다.");
            }
        }

    }

}
