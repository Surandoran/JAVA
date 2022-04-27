package Ch28;

import java.util.*;

public class C08MapMain {

    public static void main(String[] args) {

        Ch28.Info menu = new Ch28.Info();
        ArrayList<String> arr = new ArrayList<>();
        Map<String, Integer> id = new HashMap<>();
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String ID;
        int PW;
        int Value;
        while (true) {
            System.out.println("=======회원관리=======");
            System.out.println("1. ID/PW 등록");
            System.out.println("2. ID/PW 출력");
            System.out.println("3. PW 변경");
            System.out.println("4. ID/PW 삭제");
            System.out.println("5. 전체조회");
            System.out.println("6. 프로그램종료");
            System.out.println("=======회원관리=======");
            System.out.print("번호 : ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    //map 에 ID/PW등록
                    System.out.print("ID 입력 : ");
                    ID = sc.next();
                    //단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
                    if (!id.containsKey(ID)) {
                        System.out.print("PW 입력 : ");
                        PW = sc.nextInt();
                        id.put(ID, PW);
                        System.out.println("등록완료");
                    } else {
                        System.out.println("등록실패");
                    }
                    break;
                case 2:
                    //ID를 받아서 map에 있는 동일한 Id/pw 를 출력
                    System.out.print("ID 입력 : ");
                    ID = sc.next();
                    if(id.containsKey(ID)) {
                        PW = id.get(ID); // Key에 대응되는 Value꺼내기
                        System.out.println("ID : " + ID + "\nPW : " + PW);
                    }else {
                        System.out.println("ID는 없습니다.");
                    }
                    break;
                case 3:
                    //ID를 받아서 map에 있는 동일한 id의 password를 변경
                    System.out.print("ID 입력 : ");
                    ID = sc.next(); // 하나 Key 받기
                    if(id.containsKey(ID)) {
                        System.out.print("변경할 PW 입력 : ");
                        PW = sc.nextInt();
                        int NPW = id.replace(ID, PW);
                        System.out.println("ID : " + ID + "\nPW : " + PW);
                    }else {
                        System.out.println("ID는 없습니다.");
                    }
                    break;
                case 4:
                    //ID를 받아서 map에 있는 동일한 id/pw를 삭제
                    System.out.print("ID 입력 : ");
                    ID = sc.next();
                    if (id.containsKey(ID)) {
                        System.out.print("제거 ID : " + ID + "\n");
                        id.remove(ID);
                    }else {
                        System.out.println("ID가 없습니다.");
                    }
                    break;
                case 5:
                    //전체조회
                    System.out.println("{ID,PW} : " + id);
                    break;
                case 6:
                    System.exit(-1);
                default:
                    System.out.println("다시 입력...");
            }
        }
    }

}