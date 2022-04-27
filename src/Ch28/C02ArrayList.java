package Ch28;

import java.util.ArrayList;
import java.util.Scanner;

class Info{

    void menu(){
        System.out.println("=======M E N U =======");
        System.out.println("1 이름 등록");
        System.out.println("2 이름 조회");
        System.out.println("3 이름 삭제");
        System.out.println("4 이름 전체조회");
        System.out.println("5 종료");
        System.out.println("=======M E N U =======");
        System.out.print("번호 : " );
    }
}

public class C02ArrayList {

    public static void main(String[] args) {

        Info menu = new Info();
        ArrayList<String> arr = new ArrayList<>();
            int num = 0;
            Scanner sc = new Scanner(System.in);
            while(true) {
                menu.menu();
                num = sc.nextInt();
                switch(num)
            {
                case 1:
                    //이름 입력받아서 ArrayList 에  add
                    System.out.print("이름을 입력 : ");
                    arr.add(sc.next());
                    break;
                case 2:
                    System.out.print("이름을 입력 :");
                    for (String str : arr) {
                        if(sc.next().equals(str)){
                            System.out.println("***********있다***********");
                        }else {
                            System.out.println("-----------없다-----------");
                        }
                    }
                    //이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
                    break;
                case 3:
                    //이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패"
                    System.out.print("이름을 입력 : ");
                    String remove;
                    if(arr.contains(remove = sc.next())){
                        arr.remove(remove);
                        System.out.println("***********삭제완료***********");
                    }else {
                        System.out.println("-----------삭제실패-----------");
                    }
                    break;
                case 4:
                        System.out.println(arr.toString());
                    break;
                case 5:
                    System.exit(-1);
                default:
                    System.out.println("다시 입력...");
            }
        }

    }

}
